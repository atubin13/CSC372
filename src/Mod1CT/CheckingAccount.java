package Mod1CT;

import java.util.Scanner;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void processWithdrawal(double amount) {
        Scanner scanner = new Scanner(System.in);

        if (amount <= getBalance()) {
            super.withdrawal(amount);
        } else {
            // Calculate the total amount to be deducted including the overdraft fee
            double totalAmount = amount + 30.0; // $30 overdraft fee
            // Deduct the total amount
            super.withdrawal(totalAmount);
            System.out.println("Overdraft fee of $30 applied.");
        }

        scanner.close();
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.print("Enter First Name: ");
        checkingAccount.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        checkingAccount.setLastName(scanner.nextLine());

        System.out.print("Enter Account ID: ");
        checkingAccount.setAccountID(scanner.nextInt());

        System.out.print("Enter Initial Deposit Amount: $");
        double initialDeposit = scanner.nextDouble();
        checkingAccount.deposit(initialDeposit);

        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();
        checkingAccount.setInterestRate(interestRate);

        System.out.print("Enter Withdrawal Amount: $");
        double withdrawalAmount = scanner.nextDouble();
        checkingAccount.processWithdrawal(withdrawalAmount);

        checkingAccount.displayAccount();

        scanner.close();
    }
}
