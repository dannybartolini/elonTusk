package bookstore.com.bookstore.account;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "account")
@Table
public class Account {

    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "account_sequence"

    )
    @Column(
            name = "accountid"
    )
    private int accountId;

    @Column(
            name = "username"
    )
    private String userName;

    @Column(
            name = "address"
    )
    private String address;

    @Column(
            name = "name"
    )
    private String name;

    @Column(
            name = "password"
    )
    private String password;

    @Column(
            name = "paymentmethodid"
    )
    private int paymentMethodId;

    public Account() {

    }

    public Account( String userName, String password){

        this.userName = userName;
        this.password = password;
    }

    public Account(String userName, String address, String name, String password, int paymentMethodId) {

        this.userName = userName;
        this.address = address;
        this.name = name;
        this.password = password;
        this.paymentMethodId = paymentMethodId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", paymentMethodId=" + paymentMethodId +
                '}';
    }
}
