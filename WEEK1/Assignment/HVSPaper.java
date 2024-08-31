package Assignment;

public class HVSPaper extends Paper{
    
    private String color;
    private String sizeName;

    public HVSPaper(double length, double width, String color, String sizeName) {
        super(length, width);
        this.color = color;
        this.sizeName = sizeName;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Size name: " + sizeName);
    }

    public void fold() {
        System.out.println("Folding the HVS paper.");
    }

    public void tear() {
        System.out.println("Tearing the HVS paper.");
    }
}
