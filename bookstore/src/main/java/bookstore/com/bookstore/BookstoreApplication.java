package bookstore.com.bookstore;

import bookstore.com.bookstore.account.Account;
import bookstore.com.bookstore.account.AccountRepository;
import bookstore.com.bookstore.genre.Genre;
import bookstore.com.bookstore.genre.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BookstoreApplication /*implements CommandLineRunner */{
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}


	 @GetMapping
	 public String helloWorld(){
	 	return "Hello there, welcome to Elon Musks's bookstore";
	 }

//	 @Bean
//	 CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
//		return args -> {
//			Account bobsacc = new Account("bobby@gmail","wow");
//			accountRepository.save(bobsacc);
//		};
//	 }

}
