package bank;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void depositMoney(double amount){
        this.balance+=amount;
    }

    public void withdrawMoney(double amount){
        if(amount>this.balance){
            System.out.println(" insufficient funds");
        }
        else{
            this.balance-=amount;
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
