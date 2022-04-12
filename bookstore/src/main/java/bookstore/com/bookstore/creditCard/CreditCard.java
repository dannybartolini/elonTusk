package bookstore.com.bookstore.creditCard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "paymentmethod")
public class CreditCard {
    @Id
    @Column(
            name = "paymentmethodid"
    )
    private int paymentMethodId;

    @Column(
            name = "cardholdername"
    )
    private String cardHolderName;

    @Column(
            name = "cardnumber"
    )
    private int cardNumber;

    public CreditCard() {

    }

    public CreditCard(int paymentMethodId, String cardHolderName, int cardNumber) {
        this.paymentMethodId = paymentMethodId;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "paymentMethodId=" + paymentMethodId +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
