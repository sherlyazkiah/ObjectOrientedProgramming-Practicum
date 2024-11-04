package WEEK10.interfacetraining;

public class Rector {
    public void giveCertificateOfTopStudent(IAchievers student) {
        System.out.println("I am a Rector, give a Certificate of Top Student.");
        System.out.println("Congratulations! How you can get achievement?");

        student.winTheCompetition();
        student.publishTheJournal();

        System.out.println("--------------------------------------------");
    }
}
