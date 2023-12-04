package lesson10;

import java.util.Objects;

public class Student extends Object{ // extends - означает что принимает все методы из родительского класса Object

    private String fullName;
    private int age;
    private int scholarSip;

    public Student() {
    }

    public Student(String fullName, int age, int scholarSip) {
        this.fullName = fullName;
        this.age = age;
        this.scholarSip = scholarSip;
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

    public int getScholarSip() {
        return scholarSip;
    }

    public void setScholarSip(int scholarSip) {
        this.scholarSip = scholarSip;
    }

    @Override
    public boolean equals(Object o) {
        // olya --- o
        // dasha --- this
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // Преобразование типов
        // int a = 9;
        // byte b = (byte) a;
        Student student = (Student) o; // olya --- o --- Student

        if (this.age != student.age) return false;
        if (this.scholarSip != student.scholarSip) return false;
        return Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + scholarSip;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", scholarSip=" + scholarSip +
                '}';
    }
}
