package lesson12.Animals;

import lesson8.HomeWorkMy.Tour;

public class Main {
    public static void main(String[] args) {

        Tiger tiger1=new Tiger();
        Tiger tiger2=new Tiger();

        monkey monkey1=new monkey();
        monkey monkey2=new monkey();

        Animal[] animals=new Animal[4];

        animals[0]=monkey1;
        animals[1]=tiger1;
        animals[2]=tiger2;
        animals[3]=monkey2;

        for(Animal a:animals){
            a.voice(); // проявление полиморфизм
        }
    }
}
