package lesson10.HomeWork;

import java.util.Objects;

public class Book extends PrintEdition {

    private String aftor;

    public Book() {
    }

    public Book(String name, int year, int pages, String izdatel, String aftor) {
        super(name, year, pages, izdatel);
        this.aftor = aftor;
    }

    public String getAftor() {
        return aftor;
    }

    public void setAftor(String aftor) {
        this.aftor = aftor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return Objects.equals(aftor, book.aftor);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (aftor != null ? aftor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Книга: { " +
                " Название: " + name +
                " афтор " + aftor +
                " год: " + year +
                " кол-во страниц:  " + pages +
                " Издатель: " + izdatel +
                " }";
    }
}
