package WEEK3.Task;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Member donny = new Member("111333444", "Donny", 5000000);

        System.out.println("Member name: " + donny.getName());
        System.out.println("Loan Limit: " + donny.getLoanLimit());

        System.out.print("\nEnter amount to borrow: ");
        float borrowAmount = sc.nextFloat();
        donny.borrow(borrowAmount);

        System.out.print("\nEnter pay installments: ");
        float installment = sc.nextFloat();
        donny.installments(installment);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        /*System.out.println("\nBorrow money 10.000.000");
        donny.borrow(10000000);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        System.out.println("\nBorrow money 4.000.000");
        donny.borrow(4000000);
        System.out.println("Current loan amount " + donny.getLoanAmount ());

        System.out.println("\nPay installments 1.000.000");
        donny.installments(1000000);
        System.out.println("Current loan amount: " + donny.getLoanAmount ());
        
        System.out.println("\nPay installments 200.000");
        donny. installments (200000);
        System.out.println("Current loan amount: " + donny.getLoanAmount ());

        System.out.println("\nPay installments 3.000.000");
        donny. installments (3000000);
        System.out.println("Current loan amount: " + donny.getLoanAmount ());*/

        sc.close();
    }
}
