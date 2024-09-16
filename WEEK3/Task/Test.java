package WEEK3.Task;

public class Test {
    public static void main(String[] args) {
        
        Member donny = new Member("111333444", "Donny", 5000000);

        System.out.println("Member name: " + donny.getName());
        System.out.println("Loan Limit: " + donny.getLoanLimit());

        System.out.println("\nBorrow money 10.000.000");
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
        System.out.println("Current loan amount: " + donny.getLoanAmount ());
    }
}
