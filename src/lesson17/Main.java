package lesson17;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try{
            person.setAge(-20);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Hello");
    }
}
