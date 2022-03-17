package bookstore.com.bookstore.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenreService {

    @Autowired
    public GenreRepository genreRepository;

//    List<Genre> genreList = genreRepository.findAll();

    public List<Genre> getGenres(){
        //return the list of ALL genres
        List<Genre> genreList = new ArrayList<>();
        genreRepository.findAll().forEach(genreList::add);
        return genreList;
    }

}
