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
    private float rating;

    @Column(
            name = "price"
    )
    private float price;
 
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
  public book(int bookId, String bookname, float price, int authorId,
      String genre, String publishdate, float rating, Integer amountsold,
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
//   public int getISBN() {
//     return ISBN;
//   }

  public int getBook() {
    return bookId;
  }

  public String getBookName() {
    return bookname;
  }

  public float getPrice() {
    return price;
  }

  public int getAuthor() {
    return authorId;
  }

  public String getGenre() {
    return genre;
  }

//   public String getPublisher() {
//     return publisher;
//   }

  public String getPublishDate() {
    return publishdate;
  }

  public int getAmountSold() {
    return amountSold;
  }

  public float getRating(){
      return rating;
    }


  //setters
//   public void setISBN(int ISBN) {
//     this.ISBN = ISBN;
//   }

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

//   public void setPublisher(String publisher) {
//     this.publisher = publisher;
//   }

  public void setYear(String publishdate) {
    this.publishdate = publishdate;
  }

  public void setAmountSold(Integer amountsold) {
    this.amountSold = amountsold;
  }

  public void setRating(float rating){
    this.rating = rating;
  }

  public String getAuthorName() {
    return authorName;
  }
  
  public void setAuthorName(String authorName) {
      this.authorName = authorName;
  }

  public String getISBN() {
    return ISBN;
  }
  
  public void setISBN(String ISBN) {
      this.ISBN = ISBN;
  }
  
  public String getBookDescription() {
      return bookDescription;
  }
  
  public void setBookDescription(String bookDescription) {
      this.bookDescription = bookDescription;
  }

  @Override
  public String toString() {
    return "Books{" +
        //"ISBN=" + ISBN +
        ", bookId='" + bookId + '\'' +
        ", bookname='" + bookname + '\'' +
        //", genre='" + genre + '\'' +
        ", publishdate=" + publishdate + '\'' + 
        ", price=" + price +
        ", authorId='" + authorId + '\'' +
        //", publisher='" + publisher + '\'' +
        ", rating=" + rating +
        ", rating=" + amountSold +
        ", authorName='" + authorName + '\'' +
        ", ISBN='" + ISBN + '\'' +
        ", bookDescription='" + bookDescription + '\'' +
        '}';
  }

//   "bookId=" + bookId +
// ", genreId=" + genreId +
// ", genre=" + genre +
// ", authorId=" + authorId +
// ", bookName='" + bookName + '\'' +
// ", publishdate=" + publishdate +
// ", rating=" + rating +
// ", price=" + price +
// '}';
}

// package bookstore.com.bookstore.book;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity(name = "book")
// @Table
// public class book {

//     @Id
//     @Column(
//             name = "bookid"
//     )
//     private Integer bookId;

//     @Column(
//             name = "authorid"
//     )
//     private Integer authorId;
    
//     @Column(
//             name = "genreid"
//     )
//     private Integer genreId;
    

//     @Column(
//             name = "bookname"
//     )
//     private String bookName;

//     @Column(
//             name = "publishdate"
//     )
//     private String publishdate;

//     @Column(
//             name = "rating"
//     )
//     private float rating;

//     @Column(
//             name = "price"
//     )
//     private float price;

    
//     @Column(
//         name = "genre"
//     )
//     private String genre;
    

//     public book(){

//     }

//     public book(Integer bookId, String bookName) {
//         this.bookId = bookId;
//         this.bookName = bookName;
//     }

//     public Integer getbookId() {
//         return bookId;
//     }

//     public void setbookId(Integer bookId) {
//         this.bookId = bookId;
//     }
// ///////////////////////////////////////////////////////////////////
//     public String getbookName() {
//         return bookName;
//     }

//     public void setbookName(String bookName) {
//         this.bookName = bookName;
//     }
// //////////////////////////////////////////////////////////////////
//     public Integer getgenreId() {
//         return genreId;
//     }

//     public void setgenreId(Integer genreId) {
//         this.genreId = genreId;
//     }
// //////////////////////////////////////////////////////////////////
//     public Integer getauthorId() {
//         return authorId;
//     }

//     public void setauthorId(Integer authorId) {
//         this.authorId = authorId;
//     }
// /////////////////////////////////////////////////////////////////
//     public String getpublishdate() {
//         return publishdate;
//     }

//     public void setpublishdate(String publishdate) {
//         this.publishdate = publishdate;
//     }
// ////////////////////////////////////////////////////////////////
//     public Float getrating() {
//         return rating;
//     }

//     public void setrating(Float rating) {
//         this.rating = rating;
//     }
// ///////////////////////////////////////////////////////////////
//     public Float getprice() {
//         return price;
//     }

//     public void setprice(Float price) {
//         this.price = price;
//     }
// ///////////////////////////////////////////////////////////////
//     public String getGenre() {
//         return genre;
//     }

//     public void setGenre(String genre) {
//         this.genre = genre;
//     }

//     @Override
//     public String toString() {
//         return "book{" +
//                 "bookId=" + bookId +
//                 ", genreId=" + genreId +
//                 ", genre=" + genre +
//                 ", authorId=" + authorId +
//                 ", bookName='" + bookName + '\'' +
//                 ", publishdate=" + publishdate +
//                 ", rating=" + rating +
//                 ", price=" + price +
//                 '}';
//     }
// }
