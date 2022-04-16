package bookstore.com.bookstore.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<book,Integer> {

    // Retrieve list of books by particular genre
    List<book> getByGenre(String genre);

    // Retrieve list of books for a particular rating or higher
    List<book> findAllByRatingGreaterThanEqual(double rating);

    // Retieve list of top 10 books by amount sold
    List<book> findTop10ByOrderByAmountSoldDesc();
}

