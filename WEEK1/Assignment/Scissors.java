package Assignment;

public class Scissors {
    
    private int bladeLength;
    private boolean isSharp;

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public void sharpen(boolean isSharp) {
        this.isSharp = isSharp;
    }

    public Scissors(int bladeLength, boolean isSharp) {
        this.bladeLength = bladeLength;
        this.isSharp = isSharp;
    }
    
    public void displayInfo() {
        System.out.println("\nScissors blade length: " + bladeLength + " cm");
        System.out.println("Scissors is sharp: " + isSharp);
    }

    public void cut() {
        System.out.println("Cutting with the scissors.");
    }

    public void sharpenBlades() {
        this.isSharp = true;
        System.out.println("Scissors blades have been sharpened.");
    }
}
