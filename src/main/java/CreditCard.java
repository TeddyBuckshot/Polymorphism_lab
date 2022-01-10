public class CreditCard extends Card {

    public CreditCard(String cardNumber, int expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

    public String scan() {
        return "Payment Successful";
    }
}
