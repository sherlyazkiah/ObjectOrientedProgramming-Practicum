package Assignment;

public class Paper {
    
    private double length;
    private double width;

    public Paper(double length2, double width2) {
        this.length = length2;
        this.width = width2;
    }

    public void displayInfo() {
        System.out.println("\nPaper length: " + length + " cm");
        System.out.println("Paper width: " + width + " cm");
    }
}
