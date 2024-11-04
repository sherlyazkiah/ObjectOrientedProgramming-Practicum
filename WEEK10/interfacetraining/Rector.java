package WEEK10.interfacetraining;

public class Rector {
    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("I am a Rector, give a Cumlaude Certificate");
        System.out.println("Congratulations! Please introduce yourself..");

        if (student instanceof Student) {
            ((Student) student).studyInCampus();
        }
        
        student.graduate();
        student.getHighGPA();

        System.out.println("--------------------------------------------");
    }
}
