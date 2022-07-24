import java.awt.event.KeyAdapter;

public class Main {
    public static void main(String[] args) {
   Author author1 = new Author("Kathy", "Jackson");
   Book javaBook = new Book("Head Java", author1, 2018);
        System.out.println("Год издания: " + javaBook.getYearOfBook() +  ", Название книни: " + javaBook.bookName + ", Автор книги: " + javaBook.getAuthor().name+ " " + javaBook.getAuthor().surname);
    Author author2 = new Author("Hilton", "Whore");
    Book herBook = new Book ("Super Girl lol", author2, 2035);
        System.out.println("Год издания: " + herBook.getYearOfBook() +  ", Название книни: " + herBook.bookName + ", Автор книги: " + herBook.getAuthor().name+ " " + herBook.getAuthor().surname);
    herBook.setYear(2036);
        System.out.println("Год издания: " + herBook.getYearOfBook() +  ", Название книни: " + herBook.bookName + ", Автор книги: " + herBook.getAuthor().name+ " " + herBook.getAuthor().surname);
        System.out.println(javaBook.hashCode());
        System.out.println(herBook.hashCode());
        System.out.println(author1.equals(author2));
        System.out.println(javaBook.equals(herBook));
    }
}