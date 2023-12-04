package lesson10.HomeWork;

import java.util.Objects;

public class PrintEdition {

    protected String name;
    protected int year;
    protected int pages;

    protected String izdatel;

    public PrintEdition(){

    }

    public PrintEdition(String name, int year, int pages, String izdatel) {
        this.name = name;
        this.year = year;
        this.pages = pages;
        this.izdatel = izdatel;
    }

    public String getIzdatel() {
        return izdatel;
    }

    public void setIzdatel(String izdatel) {
        this.izdatel = izdatel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (year != that.year) return false;
        if (pages != that.pages) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(izdatel, that.izdatel);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + pages;
        result = 31 * result + (izdatel != null ? izdatel.hashCode() : 0);
        return result;
    }


}
