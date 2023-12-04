package lesson7;

public class Student {
    /* 1 - переменные / поля класса / свойства / характеристики
     * 2 - Конструктор (особый метот, который вызывается в момент создания объекта после слова new)
     * 3 - Методы
     */

    private int age;
    private String fullName;
    private String adres;
    private String phoneNumbers;

    public Student(){

    }

    public Student(int age,String fullName, String adres,String phoneNumbers){
        this.age=age;
        this.adres=adres;
        this.fullName=fullName;
        this.phoneNumbers=phoneNumbers;

    }

    //Метод устанавивает студенту возраст
    public void setAge(int age) {
        // this - обращение "я"
        this.age = age;
    }

    // Узнать возраст
    public int getAge(){
        return age;
    }
}
