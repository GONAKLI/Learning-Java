package bank.bankAccount78;

class BankAccount {
    private long accountNumber;
    final private String accountHolderName;
    private long balance;

    BankAccount(String name){
        this.accountHolderName = name;
    }

    public void getBalance(){
        System.out.println("your account balance is: " + this.balance);
    }

    public void deposit(int money){
        this.balance += money;
        System.out.println("Amount has been successfully credited into your account");
    }

    public void withdraw(int money){
        if(money > this.balance){
            System.out.println("Insufficient funds available in your account");
        } else if (money <= this.balance) {
            this.balance -= money;
            System.out.println("Money Withdraw, Here is your money " + money);
            this.getBalance();

            
        }
    }

}
