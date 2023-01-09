package Task1;

import java.util.Scanner;

public class CreditCard {
    private int accNumber;
    private double currentSum;

    public CreditCard(int accNumber, double currentSum) {
        this.accNumber = accNumber;
        this.currentSum = currentSum;
    }

    public void addSum() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum to add : ");
        double sum = scanner.nextDouble();
        currentSum+=sum;
        System.out.println("The current balance is: " + currentSum);
        if(currentSum < 0) {
            System.out.println("Error. Please try again");
        }
    }

    public void removeSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw: ");
        double sum = scanner.nextDouble();
        currentSum-=sum;
        if(currentSum>= 0) {
            System.out.println("The current balance is: " + currentSum);
        } else if (currentSum < 0 ) {
            System.out.println("It's failed. It isn't enough money on your account");
        }

    }
    public void outputInfo() {
        System.out.println("Your account number: " + accNumber);
        if(currentSum >=0)
            System.out.println("The current balance on your card: " + currentSum);

    }
}
