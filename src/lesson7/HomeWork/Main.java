package lesson7.HomeWork;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(8005535, "iphone", 212.3);
        Phone phone2 = new Phone(6666669, "Mi", 315.6);
        Phone phone3 = new Phone(9999999, "Nokia", 451.7);

        System.out.println("Номер телефона: " + phone1.getNumber() + "\n" + "Модель телефона: " + phone1.getModel() + "\n"
                + "Вес телефона:" + phone1.getWeight());

        System.out.println("--------------------");

        System.out.println(Phone.receiveCall("Звонит Паша\n"+phone1.getNumber()));
        System.out.println(Phone.receiveCall("Звонит Саша\n"+phone2.getNumber()));
        System.out.println(Phone.receiveCall("Звонит Петя\n"+phone3.getNumber()));


        System.out.println("-----------------------------");


        Person person1=new Person();

        person1.setFullName("Славик");

        Person person2=new Person("Паша",32);

        Person.talk(person1.getFullName());

        Person.move(person2.getFullName());
    }
}
