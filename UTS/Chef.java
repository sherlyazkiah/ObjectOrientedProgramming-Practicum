package UTS;

class Chef extends Employee {
    public Chef(String name, int skillLevel) {
        super(name, "Chef", skillLevel);
    }

    public void cook(Food food) {
        System.out.println(getName() + " is cooking " + food.getName() + "...");
        try {
            Thread.sleep(food.getCookingTime() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(food.getName() + " has been cooked by " + getName());
    }
}
