package bookstore.com.bookstore.account;

import bookstore.com.bookstore.creditCard.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Integer> {

    Account findByUserName(String userName);

}
