package WEEK2.Assignment;

public class Rental {
    public int id;
    public String memberName;
    public String gameName;
    public double pricePerDay;
    public int rentDuration;
    public double amountToPay;

    //Method to calculate amount to pay
    public double calcAmountToPay(){
        return amountToPay = pricePerDay * rentDuration;
    }

    //Method to display rental data
    public void displayData(){
        System.out.println("ID : " + id);
        System.out.println("Member Name : " + memberName);
        System.out.println("Game Name : " + gameName);
        System.out.println("Price per Day : Rp" + pricePerDay);
        System.out.println("Rent Duration : " + rentDuration + " days");
        System.out.println("Amount to Pay : Rp" + amountToPay);
    }
}
