package WEEK3.Task;

public class Member {
    private String ktpNumber;
    private String name;
    private float loanLimit;
    private float loanAmount;

    public Member(String ktpNumber, String name, float loanLimit) {
        this.ktpNumber = ktpNumber;
        this.name = name;
        this.loanLimit = loanLimit;
    }

    public String getName() {
        return name;
    }

    public float getLoanLimit() {
        return loanLimit;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void borrow(float amount) {
        if (loanAmount + amount > loanLimit) {
            System.out.println("Loan amount exceeds the limit.");
        } else {
            loanAmount += amount;
            System.out.println("Loan successful.");
        }
    }

    public void installments(float installment) {
        float minimumInstallment = loanAmount * 0.1f;
        if (installment < minimumInstallment) {
            System.out.println("Sorry, installments must be 10% of the loan amount.");
        } else {
            loanAmount -= installment;
            System.out.println("Repayment successful.");
        }
    }
}
