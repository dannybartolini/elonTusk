package bookstore.com.bookstore.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<book,Integer> {
 // book getByISBN(int ISBN);

    List<book> getByGenre(String genre);

    //List<book> getByAmountSold(Integer amountsold);

    // List<book> findTop10ByamountSold();
}

// package bookstore.com.bookstore.book;

// //import java.util.List;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import java.util.List; //added 

// @Repository //added
// public interface BookRepository extends JpaRepository<book,Integer>{
//     List<book> getBygenre(String genre); //added
// }
