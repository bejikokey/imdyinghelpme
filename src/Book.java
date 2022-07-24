public class Book {
    String bookName;
    Author author;
    int year;

    public Book (String bookName, Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    public String getbookName () {
       return this.bookName;
    }
    public Author getAuthor () {
        return  this.author;
    }
    public int getYearOfBook () {
        return this.year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String toString () {
        return "имя книги " + this.bookName + " Имя автора " + this.author + " Год выпуска " + this.year;
    }
    public int hashCode() {
        return this.bookName.hashCode() + this.author.hashCode();
    }
    public boolean equals (Object obj) {
       Book ob = (Book) obj;
        if (this == obj) return true;

        if (this.hashCode()==ob.hashCode()) return true;
        else return false;
    }
}