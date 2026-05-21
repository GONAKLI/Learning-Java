package bank.bankAccount78;

class bankCustomer {
    static void main() {
        BankAccount cust1 = new BankAccount("Sanjay");
        BankAccount cust2 = new BankAccount("Rakesh");

        cust1.getBalance();
        cust1.deposit(14000);
        cust1.withdraw(5000);
        cust1.withdraw(9000);
        cust1.withdraw(1000);
        System.out.println();
        cust2.getBalance();
    }
}
