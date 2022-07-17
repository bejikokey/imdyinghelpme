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
}