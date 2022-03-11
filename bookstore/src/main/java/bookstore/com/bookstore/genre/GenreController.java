package bookstore.com.bookstore.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    private GenreService genreService;

    @RequestMapping("/genres")
    public List<Genre> getAllGenres() {
        List<Genre> genres = genreService.getGenres();
        return genres;
    }
}
