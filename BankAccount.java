public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;
    BankAccount(String accountHolder,long accountNumber,double  balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount deposited:$"+amount);
        }else{
            System.out.println("Invalid deosit amount");
        }
    }
    public void withdraw(double amount){
    if(amount>=0&&amount<=balance){
        balance=balance-amount;
        System.out.println("Amount withdraw :$"+amount);
    }else{
        System.out.println("Invalid amount or insufficient balance");
    }
    }
}
    class Bank{
    public static void main(String[] args){
        BankAccount account=new BankAccount("Mahi",1234567890,100000);
        System.out.println("Acoount holder:"+account.getAccountHolder());
        System.out.println("Acoount numbber:"+account.getAccountNumber());
        System.out.println("Initial balance:"+account.getBalance());
        account.deposit(5000);
        account.withdraw(3000);
        System.out.println("Final balance:$"+account.getBalance());
    }
}
