package WEEK5.experiment4;

public class Seat {
    private String number;
    private Passenger passenger;

    public Seat(String number) {
        this.number = number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String info() {
        String info = "";
        info += "Number: " + number + "\n";
        if (this.passenger != null) {
            info += "Passenger: " + passenger.info() + "\n";
        }
        return info;
    }
}
