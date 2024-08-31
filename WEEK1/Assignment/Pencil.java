package Assignment;

public class Pencil {
    
    private String hardness;
    private int length;

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void displayInfo() {
        System.out.println("Pencil hardness: " + hardness);
        System.out.println("Length: " + length + " cm");
    }

    public void sharpen() {
        System.out.println("Pencil sharpened.");
    }

    public void write() {
        System.out.println("Writing with the pencil.");
    }
}
