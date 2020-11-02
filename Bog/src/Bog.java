public class Bog {

    private String titel;

    public Bog(String titel, int isbn, int year) {
        this.titel = titel;
        this.isbn = isbn;
        this.year = year;
    }

    private int isbn;
    private int year;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "titel='" + titel + '\'' +
                ", isbn=" + isbn +
                ", year=" + year +
                '}';
    }

}


