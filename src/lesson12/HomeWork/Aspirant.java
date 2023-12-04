package lesson12.HomeWork;

import java.util.Objects;

public class Aspirant extends Student{

    private String scienceProgect;

    public Aspirant(){

    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceProgect) {
        super(firstName, lastName, group, averageMark);
        this.scienceProgect = scienceProgect;
    }

    @Override
    public  void getScholarship() {
        int highScholarship = 2500;
        int lowScholarship = 2200;

        if (averageMark < 5.0) {
            System.out.println("Степендия студетнта: " + getFirstName() + " " + getLastName() + "\n" +
                    "Группа: " + getGroup() + "\n"
                    + "Равна: " + lowScholarship);
        } else System.out.println("Степендия студетнта: " + getFirstName() + " " + getLastName() + "\n" +
                "Группа: " + getGroup() + "\n" +
                "Равна: " + highScholarship);
    }

    public String getScienceProgect() {
        return scienceProgect;
    }

    public void setScienceProgect(String scienceProgect) {
        this.scienceProgect = scienceProgect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return Objects.equals(scienceProgect, aspirant.scienceProgect);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (scienceProgect != null ? scienceProgect.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scienceProgect='" + scienceProgect + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
