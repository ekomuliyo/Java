/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Account account;

        account = new Account();
        account.credit(1000);
        account.debit(300);
        account.showBalance();

    }
}

class Account {
    private double balance = 0;

    public void debit(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
    }

    public void credit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void showBalance(){
        System.out.println("Current Balance = " + balance);
    }
}