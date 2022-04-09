package bookstore.com.bookstore.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    public AccountRepository accountRepository;

//    List<Account> accountList = accountRepository.findAll();

    public List<Account> getAccounts(){
        List<Account> accountList = new ArrayList<>();
        accountList = accountRepository.findAll();
        return accountList;
    }

    public Account getAccount(String username){
        return accountRepository.findById(username).orElse(null);
    }

    public void addAccount(Account account) {
        accountRepository.save(account);
    }

    public void updateAccount(String username, Account account){
        accountRepository.save(account);
    }
}
