package bookstore.com.bookstore.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "book")
@Table
public class book {

  @Id
    @Column(
            name = "bookid"
    )
    private Integer bookId;

    @Column(
            name = "authorid"
    )
    private Integer authorId;
    
    @Column(
            name = "genreid"
    )
    private Integer genreId;
    
    @Column(
            name = "bookname"
    )
    private String bookname;

    @Column(
            name = "publishdate"
    )
    private String publishdate;

    @Column(
            name = "rating"
    )
    private double rating;

    @Column(
            name = "price"
    )
    private double price;
 
    @Column(
        name = "genre"
    )
    private String genre;

    @Column(
        name = "amountsold"
    )
    private Integer amountSold;

    @Column(
      name = "authorname"
    )
    private String authorName;

    @Column(
      name = "ISBN"
    )
    private String ISBN;

    @Column(
          name = "bookdescription"
    )
    private String bookDescription;


  public book() {

  }

  //constuctor
  public book(int bookId, String bookname, double price, int authorId,
      String genre, String publishdate, double rating, Integer amountsold,
      String authorName, String ISBN, String bookDescription) {
    this.bookId = bookId;
    this.bookname = bookname;
    this.price = price;
    this.authorId = authorId;
    this.genre = genre;
    this.publishdate = publishdate;
    this.rating = rating;
    this.amountSold = amountsold;
    this.authorName = authorName;
    this.ISBN = ISBN;
    this.bookDescription = bookDescription;
  }

  //getters
  public String getISBN() {
    return ISBN;
  }

  public int getBook() {
    return bookId;
  }

  public String getBookName() {
    return bookname;
  }

  public double getPrice() {
    return price;
  }

  public int getAuthor() {
    return authorId;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getGenre() {
    return genre;
  }

  public String getPublishDate() {
    return publishdate;
  }

  public int getAmountSold() {
    return amountSold;
  }

  public double getRating(){
      return rating;
    }

  public String getBookDescription() {
      return bookDescription;
  }


  //setter methods
  public void setBook(int bookId) {
    this.bookId = bookId;
  }

  public void setBookName(String bookname) {
    this.bookname = bookname;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setAuthor(int authorId) {
    this.authorId = authorId;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public void setYear(String publishdate) {
    this.publishdate = publishdate;
  }

  public void setAmountSold(Integer amountsold) {
    this.amountSold = amountsold;
  }

  public void setRating(double rating){
    this.rating = rating;
  }
  
  public void setAuthorName(String authorName) {
      this.authorName = authorName;
  }
  
  public void setISBN(String ISBN) {
      this.ISBN = ISBN;
  }
  
  public void setBookDescription(String bookDescription) {
      this.bookDescription = bookDescription;
  }

  @Override
  public String toString() {
    return "Books{" +
        ", bookId='" + bookId + '\'' +
        ", bookname='" + bookname + '\'' +
        ", publishdate=" + publishdate + '\'' + 
        ", price=" + price +
        ", authorId='" + authorId + '\'' +
        ", rating=" + rating +
        ", rating=" + amountSold +
        ", authorName='" + authorName + '\'' +
        ", ISBN='" + ISBN + '\'' +
        ", bookDescription='" + bookDescription + '\'' +
        '}';
  }
}