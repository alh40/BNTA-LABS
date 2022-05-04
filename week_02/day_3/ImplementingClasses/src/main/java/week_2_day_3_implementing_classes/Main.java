package week_2_day_3_implementing_classes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


            System.out.println("Please Enter your Account Number here!");
            int num = Integer.valueOf(input.nextLine());

            System.out.println("Please Enter your Name here!");
            String name = input.nextLine();

            System.out.println("Please Enter your Age here!");
            int age = Integer.valueOf(input.nextLine());

            System.out.println("Please Enter your Starting Balance here!");
            double balance = Double.valueOf(input.nextLine());

        BankAccount obj1 = new BankAccount(name, age, balance, num);

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getAccountNumber());

        while(obj1.getBalance() > 0 ){
            System.out.println("Enter amount to deposit!");
            int depositNum = Integer.valueOf(input.nextLine());

            obj1.deposit(depositNum);
            System.out.println("Your balance is " + obj1.getBalance());
            System.out.println("Would you like to deposit more?, Enter 0 to break!");

            if(depositNum == 0){
                break;
            }
        }

        while(obj1.getBalance() > 0 ){
            System.out.println("Enter amount to withdraw!, Enter 0 to break!");
            int withdrawNum = Integer.valueOf(input.nextLine());
            obj1.withdraw(withdrawNum);
            System.out.println("Your balance is " + obj1.getBalance());

            if(withdrawNum == 0){
                break;
            }
        }

        System.out.println(obj1.toString());

    }


}
