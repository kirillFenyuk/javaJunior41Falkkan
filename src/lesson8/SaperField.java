package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] fieldWithMins; // Оставляем данное поле пустым так как мы не знаем какой вариант выберет пользователь
    private int countMins;
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWin = 0;

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            fieldWithMins = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean[9 + 2][9 + 2];
            countMins = 10;
            countClosedCellsToWin = countMins + ((9 + 9) * 2 + 4);
        }

        if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            fieldWithMins = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countMins = 40;
            countClosedCellsToWin = countMins + ((16 + 16) * 2 + 4);
        }

        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            fieldWithMins = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean[16 + 2][32 + 2];
            countMins = 99;
            countClosedCellsToWin = countMins + ((16 + 32) * 2 + 4);
        }

        if (level.equals("4") || level.equalsIgnoreCase("Особый")) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите кол-во строк");
            int row = scanner.nextInt();

            System.out.println("Введите кол-во колонок");
            int col = scanner.nextInt();

            System.out.println("Введите кол-во мин");
            countMins = scanner.nextInt();

            fieldWithMins = new int[row + 2][col + 2];
            fieldToOpen = new boolean[row + 2][col + 2];
            countClosedCellsToWin = countMins + ((row + col) * 2 + 4);
        }
    }

    public void addRandomMins() {
        for (int i = 0; i < countMins; i++) {

            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMins.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMins[0].length - 1);

            if (fieldWithMins[row][col] != -1) {
                fieldWithMins[row][col] = -1;
            } else {
                i--;
            }
        }
    }

    public void countAndAddNums() {
        for (int i = 0; i < fieldWithMins.length; i++) {
            for (int j = 0; j < fieldWithMins[0].length; j++) {
                // заполняем всех соседей +1 к числу, если в клеточке мина
                if (fieldWithMins[i][j] == -1) {
                    if (fieldWithMins[i - 1][j - 1] != -1) {
                        fieldWithMins[i - 1][j - 1] = fieldWithMins[i - 1][j - 1] + 1;
                    }
                    if (fieldWithMins[i - 1][j] != -1) {
                        fieldWithMins[i - 1][j] = fieldWithMins[i - 1][j] + 1;
                    }
                    if (fieldWithMins[i - 1][j + 1] != -1) {
                        fieldWithMins[i - 1][j + 1] = fieldWithMins[i - 1][j + 1] + 1;
                    }
                    if (fieldWithMins[i + 1][j + 1] != -1) {
                        fieldWithMins[i + 1][j + 1] = fieldWithMins[i + 1][j + 1] + 1;
                    }
                    if (fieldWithMins[i][j - 1] != -1) {
                        fieldWithMins[i][j - 1] = fieldWithMins[i][j - 1] + 1;
                    }
                    if (fieldWithMins[i + 1][j] != -1) {
                        fieldWithMins[i + 1][j] = fieldWithMins[i + 1][j] + 1;
                    }
                    if (fieldWithMins[i][j + 1] != -1) {
                        fieldWithMins[i][j + 1] = fieldWithMins[i][j + 1] + 1;
                    }

                }
            }
        }
    }


    public void printField() {
        System.out.println("--------- Ваше поле ---------");

        for (int i = 1; i < fieldWithMins.length - 1; i++) { //Обходим первую строку
            for (int j = 1; j < fieldWithMins[0].length - 1; j++) { //Обходим первую колонку
                if (fieldToOpen[i][j] == true) {  // Если клеточка активна
                    System.out.print(fieldWithMins[i][j] + " ");
                } else { // Если клеточка закрыта
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    public void printFieldEndGame() {
        System.out.println("--------- Ваше поле ---------");

        for (int i = 1; i < fieldWithMins.length - 1; i++) { //Обходим первую строку
            for (int j = 1; j < fieldWithMins[0].length - 1; j++) { //Обходим первую колонку
                if (fieldToOpen[i][j] == true || fieldWithMins[i][j] == -1) {  // Если клеточка активна или там мина
                    System.out.print(fieldWithMins[i][j] + " ");
                } else { // Если клеточка закрыта
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    public boolean doStep() {

        if (countClosedCellsToWin == this.countClosedCells()) {
            System.out.println("----- Вы выйграли -------");
            this.printFieldEndGame();
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите строку:");
        int row = scanner.nextInt();

        System.out.println("Выберите колонку:");
        int col = scanner.nextInt();

        if (row <= 0 || row > fieldWithMins.length - 1 || col <= 0 || col > fieldWithMins[0].length - 1) { // Если индексы не коректны
            System.out.println("Повторите ввод!!! Неверные индексы");
            this.doStep(); //Рекурсивный вызов метода (вызывает внутри сам себя при определённых условиях)
        }

        if (fieldToOpen[row][col]==true){ // Проверка задублированого хода
            System.out.println("Эта ячейка уже была выбрана");
            this.doStep(); //Рекурсивный вызов метода (вызывает внутри сам себя при определённых условиях)
        }

        // 100% знаем что индексы нам подходят

        //Экспрес провера на окончание игры, еслди игрок неаступил на мину
        if (fieldWithMins[row][col] == -1) {
            System.out.println("Вы проиграли!");
            this.printFieldEndGame();
            return false; // Даём ответ что ещё дин шаг не нужен
        } else {  // Если в ячейке не мина и нужно продолжить
            fieldToOpen[row][col] = true;
            return true; // Даём ответ что шаг ещё нуден
        }
    }

    private int countClosedCells() {
        int count = 0;
        for (int i = 0; i < fieldToOpen.length; i++) {
            for (int j = 0; j < fieldToOpen.length; j++) {
                if (fieldToOpen[i][j] == false) {
                    count++;
                }
            }
        }
        return count;
    }

}
