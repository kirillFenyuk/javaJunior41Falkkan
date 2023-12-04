package lesson12.HomeWork;

public class Main {
    public static void main(String[] args) {

        Student student1 =new Student("Юлия","Столяр","А",5.0);
        Student student2 =new Student("Кирилл","Фенюк","D",4.3);
        Student aspirant1=new Aspirant("Синчинов","Николай","A",5.0,"Преломление света");
        Student aspirant2=new Aspirant("Черков","Роман","В",4.0,"Давление");

        Student[] jurnal=new Student[4];

        jurnal[0]=student1;
        jurnal[1]=student2;
        jurnal[2]=aspirant1;
        jurnal[3]=aspirant2;

        for (Student s:jurnal){
            s.getScholarship();
            System.out.println("----------");
        }
    }
}
