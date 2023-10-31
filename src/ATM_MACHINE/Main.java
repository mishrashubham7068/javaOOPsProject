package ATM_MACHINE;

import java.util.Scanner;

class atm {
    float Balance;
    int Pin = 123456;

    public void checkpin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == Pin) {
            menu();
        } else {
            System.out.println("Please Enter a Right Pin");
            checkpin();
        }
    }

    public void menu() {
        System.out.println("Enter your choice : ");
        System.out.println("1. Check A/c Balance : ");
        System.out.println("2. Withdraw Money : ");
        System.out.println("3. Deposite Money : ");
        System.out.println("4.  Exit : ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance  : " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter a amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance ");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdraw Succefull");
        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposite Successfully");
        menu();
    }


}

public class Main {
    public static void main(String[] args) {
        atm obj = new atm();
        obj.checkpin();
    }
}