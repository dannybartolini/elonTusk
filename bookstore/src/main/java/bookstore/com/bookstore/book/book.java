package bookstore.com.bookstore.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "book")
@Table
public class book {

    
    @Column(
            name = "bookid"
    )
    private Integer bookId;

    @Column(
            name = "authorid"
    )
    private Integer authorId;

    @Id
    @Column(
            name = "genreid"
    )
    private Integer genreId;
    

    @Column(
            name = "bookname"
    )
    private String bookName;

    @Column(
            name = "publishdate"
    )
    private String publishdate;

    @Column(
            name = "rating"
    )
    private float rating;

    @Column(
            name = "price"
    )
    private float price;
    

    public book(){

    }

    public book(Integer bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public Integer getbookId() {
        return bookId;
    }

    public void setbookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getgenreId() {
        return genreId;
    }

    public void setgenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", genreId=" + genreId +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
