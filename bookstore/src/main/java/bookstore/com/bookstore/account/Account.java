package bookstore.com.bookstore.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "account")
@Table
public class Account {


    @Column(
            name = "accountid"
    )
    private int accountId;
    @Id
    @Column(
            name = "name"
    )
    private String userName;

    @Column(
            name = "addressid"
    )
    private int addressId;

    @Column(
            name = "contactid"
    )
    private int contactid;

    public Account() {

    }

    public Account(int accountId, String userName, int addressId, int contactid) {
        this.accountId = accountId;
        this.userName = userName;
        this.addressId = addressId;
        this.contactid = contactid;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getContactid() {
        return contactid;
    }

    public void setContactid(int contactid) {
        this.contactid = contactid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", addressId=" + addressId +
                ", contactid=" + contactid +
                '}';
    }
}
