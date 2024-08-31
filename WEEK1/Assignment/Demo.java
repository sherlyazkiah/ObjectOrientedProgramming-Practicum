package Assignment;

public class Demo {
    public static void main(String[] args) {
        Pencil myPencil = new Pencil();
        Scissors myScissors = new Scissors(8, true);
        HVSPaper myHvsPaper = new HVSPaper(21, 29.7, "white", "A4");
        WatercolorPaper myWatercolorPaper = new WatercolorPaper(21, 14.8, "rough", 200);

        myPencil.setHardness("3B");
        myPencil.setLength(15);
        myPencil.displayInfo();
        myPencil.sharpen();
        myPencil.write();

        myScissors.displayInfo();
        myScissors.cut();
        myScissors.sharpenBlades();

        myHvsPaper.displayInfo();
        myHvsPaper.fold();
        myHvsPaper.tear();

        myWatercolorPaper.displayInfo();
        myWatercolorPaper.absorbWater();
        myWatercolorPaper.paintOn();
    }    
}
