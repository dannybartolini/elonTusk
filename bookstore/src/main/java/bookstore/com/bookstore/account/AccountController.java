package bookstore.com.bookstore.account;

import bookstore.com.bookstore.genre.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/accounts")
    public List<Account> getAllAccounts(){
        List<Account> accounts = accountService.getAccounts();
        return accounts;
    }

    @RequestMapping("/accounts/{username}")
    public Account getAccount(@PathVariable String username){
        return accountService.getAccount(username);

    }

    @RequestMapping(method = RequestMethod.POST, value="/accounts")
    public void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

}
