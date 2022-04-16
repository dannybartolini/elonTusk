package bookstore.com.bookstore.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    public AuthorRepository authorRepository;

    //  List<Author> authorList = authorRepository.findAll();

    public List<Author> getAuthors(){
        //return the list of authors
        List<Author> authorList = new ArrayList<>();
        authorRepository.findAll().forEach(authorList::add);
        return authorList;
    }
    public Author getAuthor(String authorname) {
        return authorRepository.findById(authorname).orElse(null);
    }
}
