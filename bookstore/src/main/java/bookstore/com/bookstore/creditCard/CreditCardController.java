package bookstore.com.bookstore.creditCard;

import bookstore.com.bookstore.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class CreditCardController {

    @Autowired
    private CreditCardService creditCardService;

    @RequestMapping("/creditcards")
    public List<CreditCard> getAllCards(){
        List<CreditCard> cards = creditCardService.getAllCards();
        return cards;
    }

    @RequestMapping(value = "/creditcards/{cardholdername}")
    public List<CreditCard> getCards(@PathVariable String cardholdername){
        //return creditCardService.getCards(Collections.singletonList(cardholdername));
        String myName = cardholdername;
        return creditCardService.getCards(myName);

    }

    @RequestMapping(method = RequestMethod.POST, value="/creditcards")
    public void addCard(@RequestBody CreditCard creditCard){
        creditCardService.addCard(creditCard);
    }
}
