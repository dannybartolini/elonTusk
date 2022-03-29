package bookstore.com.bookstore.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping("/authors")
    public List<Author> getAllAuthors() {
        List<Author> authors = authorService.getAuthors();
        return authors;
    }

    @RequestMapping("/authors/{authorname}")
    public Author getAuthor(@PathVariable String authorname) {
        return authorService.getAuthor(authorname);
    }



}
