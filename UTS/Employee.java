package UTS;

public class Employee {
    private String name;
    private String role;
    private int skillLevel;

    public Employee(String name, String role, int skillLevel) {
        this.name = name;
        this.role = role;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getSkillLevel() {
        return skillLevel;
    }
}
