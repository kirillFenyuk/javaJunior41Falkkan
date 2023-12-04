package lesson12.HomeWork;

import java.util.Objects;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public  void getScholarship() {
        int highScholarship = 2000;
        int lowScholarship = 1900;

        if (averageMark < 5.0) {
            System.out.println("Степендия студетнта: " + getFirstName() + " " + getLastName() + "\n" +
                    "Группа: " + getGroup() + "\n"
                    + "Равна: " + lowScholarship);
        } else System.out.println("Степендия студетнта: " + getFirstName() + " " + getLastName() + "\n" +
                "Группа: " + getGroup() + "\n" +
                "Равна: " + highScholarship);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(averageMark, student.averageMark) != 0) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(lastName, student.lastName)) return false;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
