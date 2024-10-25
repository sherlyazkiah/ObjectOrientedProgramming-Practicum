package UTS;

public class Cleaner extends Employee {
    public Cleaner(String name, int skillLevel) {
        super(name, "Cleaner", skillLevel);
    }

    public void cleanTable() {
        System.out.println(getName() + " is cleaning table ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Table has been cleaned by " + getName());
    }
}
