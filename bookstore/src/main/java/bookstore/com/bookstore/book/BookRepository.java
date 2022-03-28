package bookstore.com.bookstore.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<book,Integer>{
}
