package WEEK5.experiment2;

public class MainExperiment2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("Avanza");
        c.setCost(350000);

        Driver d = new Driver();
        d.setName("John Doe");
        d.setCost(200000);

        Customer cust = new Customer();
        cust.setName("Jane Doe");
        cust.setCar(c);
        cust.setDriver(d);
        cust.setDay(2);

        System.out.println("Total cost = " + cust.totalCostCalculation());
    }
}
