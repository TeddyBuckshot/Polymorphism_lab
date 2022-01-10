public class DebitCard extends Card {
    private String sortCode;
    private int accountNumber;


    public DebitCard(String cardNumber, int expiryDate, int securityNumber, String sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }


    public String getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String scan() {
        return "Payment Complete";
    }
}
