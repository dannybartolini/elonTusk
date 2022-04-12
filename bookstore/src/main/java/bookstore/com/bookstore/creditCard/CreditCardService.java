package bookstore.com.bookstore.creditCard;

import bookstore.com.bookstore.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditCardService {

    @Autowired
    public CreditCardRepository creditCardRepository;

    public List<CreditCard> getAllCards(){
        List<CreditCard> cardList = new ArrayList<>();
        cardList = creditCardRepository.findAll();
        return cardList;
    }

    public List<CreditCard> getCards(String cardHolderName){
        //cardList = creditCardRepository.findAllById(cardHolderName)
        return creditCardRepository.getByCardHolderName(cardHolderName);
    }

    public void addCard(CreditCard creditCard) {

        creditCardRepository.save(creditCard);
    }
}
