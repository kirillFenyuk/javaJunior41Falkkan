package lesson21;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;
    private boolean stopFlag = true;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (stopFlag) {
            // или задача или null
            Task task = storage.get();
            if (task != null) { // если задача есть
                System.out.println("Я поток - " + Thread.currentThread().getName() + " взял задачу: " + task);
                System.out.println("Я поток - " + Thread.currentThread().getName() + " попытаюсь выполнить задачу: " + task);
                try {
                    task.execute();
                    System.out.println("Я поток - " + Thread.currentThread().getName() + " задачу выполнил успешно: " + task);
                } catch (TaskExecutionFailedException e) {
                    System.out.println("Я поток - " + Thread.currentThread().getName() + " неудалось выполнить задачу: " + task);
                    if (task.getTryCount() < 5) { // если её пытались выполнить менее 5 раз
                        task.incTryCount(); // увеличиваем кол. попыток на 1
                        storage.add(task); // вернули задачу
                    } else { // если попыталоись выполнить более 5 раз
                        System.out.println("Я поток - " + Thread.currentThread().getName() + " удаляю задачу: " + task);
                    }
                }
            } else { // если задачи закончились
                System.out.println("Я поток - " + Thread.currentThread().getName() + " завершаю работу, задач нет " + task);
                stopFlag = false;
            }
        }
    }
}
