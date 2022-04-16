package bookstore.com.bookstore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//PreparedStatement selectBookByGenre = con.prepareStatement("SELECT * FROM Books WHERE genreid = ?");

@Service
public class BookService {

    @Autowired
    public BookRepository BookRepository;

//    List<Book> BookList = BookRepository.findAll();
    // private List<book> book = Arrays.aslist(
    //     new book("bookid","authorid","genreid","bookname","publshdate","rating","price")
    // );

    public List<book> getBooks(){
        //return the list of ALL Books
        List<book> BookList = new ArrayList<>();
        BookRepository.findAll().forEach(BookList::add);
        return BookList;
    }

    public book getBooksByGenre(Integer genreid){
        //return the list of ALL Books by genre
        return BookRepository.findById(genreid).orElse(null);
    }

    // public List<book> getBooksByGenre(Integer genreid){
    //     //return the list of ALL Books by genre
    //     List<book> BookGenreList = new ArrayList<>();
    //     BookRepository.findById(genreid).forEach(BookGenreList::add).orElse(null); //BookRepository.findAll().forEach(BookGenreList::add);
    //     return BookGenreList;
    // }


}