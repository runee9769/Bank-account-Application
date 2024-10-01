package bankaccountapp;

public class Checking extends Account{
    private long debitCardNumber;
    private int debitCardPin;
    public Checking(String name, String SSN, double initDeposit) {
        super(name,SSN,initDeposit);
        accountNumber = 2+accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate()*0.15;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features: "  + "\nCardNo: " + debitCardNumber + "\nCardPin: " + debitCardPin);
    }
    public void setDebitCard(){
        debitCardNumber = (long) (Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
    }
}
