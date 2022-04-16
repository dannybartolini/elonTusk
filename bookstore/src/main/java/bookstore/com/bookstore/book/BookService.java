package bookstore.com.bookstore.book;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

  private final BookRepository BookRepository;

  @Autowired
  public BookService(BookRepository BookRepository) {
    this.BookRepository = BookRepository;
  }

      public List<book> getBooks(){
        //return the list of ALL Books
        List<book> BookList = new ArrayList<>();
        BookRepository.findAll().forEach(BookList::add);
        return BookList;
    }

  //genre
  public List<book> getByGenre(String genre) {
    return BookRepository.getByGenre(genre);
  }

  //top 10
  public List<book> getTopTen(){
    return BookRepository.findTop10ByOrderByAmountSoldDesc();
  }

  //rating
  public List<book> getBookByRating(double rating){
    return BookRepository.findAllByRatingGreaterThanEqual(rating);
  }


  //give x amount of books provided by a user
  public List<book> getBookByX(int index){
    List<book> books = new ArrayList<>();
    for(int i = 0; i < index; i++){
      books.add(BookRepository.findAll().get(i));
    }
    return books;
  }
}