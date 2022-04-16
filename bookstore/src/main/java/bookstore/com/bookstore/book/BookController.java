package bookstore.com.bookstore.book;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "rest/books")
public class BookController {

  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

//   @GetMapping
//   public List<book> getBooks() {
//     return bookService.getBookJSON();
//   }


  /* Actions:
   * An administrator must be able to create a book with the book ISBN, book
   *name, book description, price, genre, genre, publisher , year published and
   */
//   @PostMapping
//   public void registerNewBook(@RequestBody book book) {
//     bookService.addNewBook(book);
//   }


  //Must be able retrieve a book’s details by the ISBN.
//   @GetMapping("/ISBN/{ISBN}")
//   public book getDetail(@PathVariable int ISBN) {
//     return bookService.getByISBN(ISBN);
//   }
    @GetMapping("/books")
    public List<book> getAllBooks() {
        List<book> Books = bookService.getBooks(); 
        return Books;
    }

  // Must be able to retrieve a list of books associated with an genre.
  @GetMapping("/books/{genre}")
  public List<book> getByGenre(@PathVariable String genre) {
    String newString = genre.replace("+", " ");
    return bookService.getByGenre(newString);

  }

    // Must be able to retrieve a list of books associated with an genre.
    // @GetMapping("/books/top10")
    // public List<book> getTop() {
    //   //String newString = amountsold.replace("+", " ");
    //   return bookService.getTopTen(); // alter
  
    // }

}

// package bookstore.com.bookstore.book;

// import org.springframework.beans.factory.annotation.Autowired;
// //import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.Collections;
// import java.util.List;

// @RestController
// public class BookController {

//     //@Autowired
//     private final BookService bookService;

//     @Autowired
//     public BookController(BookService bookService) {
//       this.bookService = bookService;
//     }
//     //private BookService bookService;

//     @RequestMapping("/books")
//     public List<book> getAllBooks() {
//         List<book> Books = bookService.getBooks(); 
//         return Books;
//     }

//     // @RequestMapping("/books/{genreid}")
//     // public book getGenreBooks(@PathVariable Integer genreid) {
//     //     book BooksGenre = BookService.getBooksByGenre(genreid);
//     //     return BooksGenre;
//     // } //test
//     @RequestMapping("/books/{genreid}")
//     public List<book> getBygenre(@PathVariable String genre)
//     {
//         return bookService.getBygenre(genre);//getBookGenre(Collections.singletonList(genre)); // //
//     }

//     // @RequestMapping(value = "/books/{genre}")
//     // public List<book> getGenreBooks(@PathVariable String genre) {
//     //     return BookService.getBooksByGenre(Collections.singletonList(genre));
//     //     //return BooksGenre;
//     // }
// }
