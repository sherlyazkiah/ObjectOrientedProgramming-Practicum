package Assignment;

public class WatercolorPaper extends Paper{
    
    private String texture;
    private int thickness;

    public WatercolorPaper(double length, double width, String texture, int thickness) {
        super(length, width);
        this.texture = texture;
        this.thickness = thickness;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Texture: " + texture);
        System.out.println("Thickness: " + thickness + " gsm");
    }

    public void absorbWater() {
        System.out.println("Watercolor paper absorbing water.");
    }

    public void paintOn() {
        System.out.println("Painting on the watercolor paper.");
    }
}
