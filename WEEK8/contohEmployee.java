package WEEK8;

class contohEmployee {
    private String nama;
    private String role;  // "Memasak", "Melayani", atau "Membersihkan"
    private int skillLevel;  // skill level dari 1-10

    public contohEmployee(String nama, String role, int skillLevel) {
        this.nama = nama;
        this.role = role;
        this.skillLevel = skillLevel;
    }

    public String getNama() {
        return nama;
    }

    public String getRole() {
        return role;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void tampilkanKaryawan() {
        System.out.println("Karyawan: " + nama + " | Role: " + role + " | Skill: " + skillLevel);
    }
}
