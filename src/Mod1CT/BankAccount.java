package Mod1CT;

import java.util.Scanner;

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than zero.");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void accountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();
        System.out.print("Enter First Name: ");
        account.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        account.setLastName(scanner.nextLine());

        System.out.print("Enter Account ID: ");
        account.setAccountID(scanner.nextInt());

        System.out.print("Enter Initial Deposit Amount: $");
        double initialDeposit = scanner.nextDouble();
        account.deposit(initialDeposit);

        account.accountSummary();

        scanner.close();
    }
}
