package bankaccountapp;

public class Savings extends Account{
    private int DepositBoxID;
    private int DepositBoxCode;

    public Savings(String name,String SSN, double initDeposit) {
        super(name,SSN,initDeposit);
        accountNumber = 1+accountNumber;
        setSAfetyDepositBox();
    }
    private void setSAfetyDepositBox(){
        DepositBoxID = (int) (Math.random() * Math.pow(10,3));
        DepositBoxCode = (int) (Math.random() * Math.pow(10,4));
    }
    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\nID: " + DepositBoxID + "\nCode: " + DepositBoxCode );
    }
}
