package week_2_day_3_implementing_classes;

public class BankAccount {
    private String name;
    private int age;
    private double balance;
    private int accountNumber;
    private double quantity;


    public BankAccount(String newName, int newAge, double newBalance, int cNum){
        this.name = newName;
        this.age = newAge;
        this.balance = newBalance;
        this.accountNumber = cNum;

    }

    public void setAccountNumber(int cNumber){
        this.accountNumber = cNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void deposit(double quantity){
        if(quantity <= 0){
            System.out.println("Please Deposit a positive value!");
        }else{
            this.balance = this.balance + quantity;
            System.out.println("Thank you for depositing!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double quantity){
        if(quantity < 0){
            System.out.println("Please Withdraw a positive value!");
        }else{
            if(this.balance < quantity){
                System.out.println("Insufficient funds!");
            }else{
                this.balance = this.balance - quantity;
                System.out.println("Thank you for withdrawing!");
            }
        }
    }

    public String toString() {
        return "BankAccount: "  + "name = " + name +  ", age = " + age + ", balance = " + balance + ", accountNumber = " + accountNumber;
    }


}
