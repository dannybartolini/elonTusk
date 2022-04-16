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

  @GetMapping("/books")
  public List<book> getAllBooks() {
      List<book> Books = bookService.getBooks(); 
      return Books;
  }

  // Controller to retrieve a list of books associated with an input genre.
  @GetMapping("/books/{genre}")
  public List<book> getByGenre(@PathVariable String genre) {
    String newString = genre.replace("+", " ");
    return bookService.getByGenre(newString);
  }

  // Controller to return books with a rating >= input double
  @GetMapping("/books/rating/{rating}")
  public List<book> getRating(@PathVariable double rating) {
    return bookService.getBookByRating(rating);
  }
  
  // Controller to retrieve a list of top 10 books by amountsold.
  @GetMapping("/books/top10")
  public List<book> getTop() {
    return bookService.getTopTen();

  }

  @GetMapping("books/index/{index}")
  public List<book> getBooks(@PathVariable int index) {
    return bookService.getBookByX(index);
  }

}