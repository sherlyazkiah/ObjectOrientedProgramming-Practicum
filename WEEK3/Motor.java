package WEEK3;

public class Motor {
    // instansiasi atribut
    private int speed = 0;
    private boolean motorOn = false;
    private final int MAX_SPEED = 100; // maximum speed limit

    public void startEngine() {
        motorOn = true;
    }   

    public void turnOffEngine() {
        motorOn = false;
        speed = 0;
    }

    public void increaseEngine() {
        if (motorOn == true) {
            if (speed +5 > MAX_SPEED) {
                speed = MAX_SPEED;
                System.out.println("Motor cycle reach maximum speed!");
            } else {
                speed += 5;   
            }
        } else {
            System.out.println("Speed cannot appear because the engine is off!");
        }
    }

    public void reduceEngine() {
        if (motorOn == true) {
            speed -= 5;
        } else {
            System.out.println("Speed cannot appear because the engine is off!");
        }
    }

    public void statusPrint() {
        if (motorOn == true) {
            System.out.println("Motor cycle On");
        } else {
            System.out.println("Motor cycle Off");
        }
        System.out.println("Speed: " + speed + "\n");
    }
}
