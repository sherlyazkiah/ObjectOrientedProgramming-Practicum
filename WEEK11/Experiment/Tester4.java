package WEEK11.Experiment;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-2");
        ow.pay(eBill); //pay for electricity bill
        System.out.println("---------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); // pay for permanent employee
        System.out.println("---------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); //show permanent employee info
        System.out.println("---------------------------------");
        ow.showMyEmployee(iEmp); //show internship employee info

        ow.pay(iEmp);
    }
}
