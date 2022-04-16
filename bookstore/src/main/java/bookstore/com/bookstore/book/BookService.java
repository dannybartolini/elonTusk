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

//   public List<book> getBookJSON() {
//     return BookRepository.findAll();
//   }
      public List<book> getBooks(){
        //return the list of ALL Books
        List<book> BookList = new ArrayList<>();
        BookRepository.findAll().forEach(BookList::add);
        return BookList;
    }

//   public void addNewBook(book book) {
//     System.out.println(book);
//     BookRepository.save(book);
//   }

//   public book getByISBN(int ISBN) {
//     return BookRepository.getByISBN(ISBN);
//   }

  public List<book> getByGenre(String genre) {
    return BookRepository.getByGenre(genre);
  }

  //top 10
  // public List<book> getTopTen(){
  //   return BookRepository.findTop10ByamountSold();
  // }


}

// package bookstore.com.bookstore.book;

// //import bookstore.com.bookstore.BookRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;

// @Service
// public class BookService {

//     private final BookRepository BookRepository; //added

//     @Autowired
//     public BookService(BookRepository BookRepository) {
//       this.BookRepository = BookRepository;
//     } //added
//     //@Autowired
//     //public BookRepository BookRepository;

//     public List<book> getBooks(){
//         //return the list of ALL Books
//         List<book> BookList = new ArrayList<>();
//         BookRepository.findAll().forEach(BookList::add);
//         return BookList;
//     }

//     // public book getBooksByGenre(Integer genreid){
//     //     //return the list of ALL Books by genre
//     //     return BookRepository.findById(genreid).orElse(null);
//     // }

//     public List<book> getBygenre(String genre){
//         //return the list of ALL Books by genre
//         //List<book> bookGenreList = new ArrayList<>();
//         //bookGenreList = 
//         return BookRepository.getBygenre(genre);//findAllById(genre); //
//         //return bookGenreList;
//     }

// }
