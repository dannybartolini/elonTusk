package bookstore.com.bookstore.creditCard;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditCardRepository extends JpaRepository<CreditCard,Integer> {

    List<CreditCard> getByCardHolderName(String cardHolderName);
}
