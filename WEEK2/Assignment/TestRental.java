package WEEK2.Assignment;

public class TestRental {
    public static void main(String[] args) {
        Rental rent1 = new Rental();

        rent1.id = 101;
        rent1.memberName = "Henry";
        rent1.gameName = "Chained Together";
        rent1.pricePerDay = 45000;
        rent1.rentDuration = 6;
        rent1.calcAmountToPay();
        rent1.displayData();
    }
}
