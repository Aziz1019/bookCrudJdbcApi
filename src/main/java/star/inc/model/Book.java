package star.inc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private long id;
    private String author;
    private String book_name;
    private String date;

    public Book(String author, String book_name) {
        this.author = author;
        this.book_name = book_name;
    }

    public Book(long id, String author, String book_name) {
        this.id = id;
        this.author = author;
        this.book_name = book_name;
    }
}
