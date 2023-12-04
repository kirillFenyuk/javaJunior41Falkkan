package lesson10.HomeWork;

import java.util.Objects;

public class Magazine extends PrintEdition {

    private int numInYear;

    public Magazine() {
    }

    public Magazine(String name, int year, int pages, String izdatel, int numInYear) {
        super(name, year, pages, izdatel);
        this.numInYear = numInYear;
    }

    public int getNumInYear() {
        return numInYear;
    }

    public void setNumInYear(int numInYear) {
        this.numInYear = numInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        return numInYear == magazine.numInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numInYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал: { " +
                " Название: " + name +
                " год: " + year +
                " номер: " + numInYear +
                " кол-во страниц:  " + pages +
                " Издатель: " + izdatel +
                " }";
    }
}
