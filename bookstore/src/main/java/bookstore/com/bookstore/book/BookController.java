package bookstore.com.bookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService BookService;

    @RequestMapping("/books")
    public List<book> getAllBooks() {
        List<book> Books = BookService.getBooks();
        return Books;
    }

    @RequestMapping("/books/{genreid}")
    public book getGenreBooks(@PathVariable Integer genreid) {
        book BooksGenre = BookService.getBooksByGenre(genreid);
        return BooksGenre;
    } //test

    // @RequestMapping("/books/{genreid}")
    // public List<book> getGenreBooks(@PathVariable Integer genreid) {
    //     List<book> BooksGenre = BookService.getBooksByGenre(genreid);
    //     return BooksGenre;
    // }
}
