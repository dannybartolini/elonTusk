package bookstore.com.bookstore.wishlist;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "wishlist")
@Table
public class WishList {

    @Id
    @Column(
            name = "wishlistid"
    )
    private Integer wishlistId;

    @Column(
            name = "accountid"
    )
    private Integer accountId;

    @Column(
            name = "wishlistname"
    )
    private String wishlistName;

    @Column(
            name = "books"
    )
    private String Books;

    public WishList(){

    }

    public WishList(int wishlistId, String wishlistName, int accountId, String Books) {
        this.wishlistId = wishlistId;
        this.wishlistName = wishlistName;
        this.accountId = accountId;
        this.Books = Books;
    }

    public Integer getwishlistId() {
        return wishlistId;
    }

    public void setwishlistId(Integer wishlistId) {
        this.wishlistId = wishlistId;
    }

    public String getwishlistName() {
        return wishlistName;
    }

    public void setwishlistName(String wishlistName) {
        this.wishlistName = wishlistName;
    }

    public Integer getaccountId() {
        return accountId;
    }

    public void setgetaccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getBooks() {
        return Books;
    }

    public void setBooks(String Books){this.Books = Books;}

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishlistId=" + wishlistId +
                ", wishlistName='" + wishlistName + "accountId " + accountId + "Books" + Books + '\'' +
                '}';
    }
}
//Must have 3 different wish lists
// might have to change wishmmlistid and name to bookid and name since they are both referring to the same thing
//techicanlly speaking