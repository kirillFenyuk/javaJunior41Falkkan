package lesson7.HomeWork;

public class Person {

    private String fullName;
    private int age;

    public Person(){

    }

    public Person(String fullName,int age){
        this.fullName=fullName;
        this.age=age;
    }


    public static void move(String fullName) {
        System.out.println(fullName + " идёт.");
    }

    public static void talk(String fullName){
        System.out.println(fullName + " говорит.");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
