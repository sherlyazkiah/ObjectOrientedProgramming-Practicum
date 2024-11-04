package WEEK10.interfacetraining;

public class Program {
    public static void main(String[] args) {
        Rector MrRector = new Rector();

        //Undergraduated ordinaryStudent = new Undergraduated("Charlie", "3,1");
        Undergraduated undergraduatedCumlaude = new Undergraduated("Joe");
        Postgraduated postgraduatedCumlaude = new Postgraduated("Ben");

        //MrRector.giveCumlaudeCertificate(ordinaryStudent);
        //MrRector.giveCumlaudeCertificate(undergraduatedCumlaude);
        //MrRector.giveCumlaudeCertificate(postgraduatedCumlaude);

        MrRector.giveCertificateOfTopStudent(undergraduatedCumlaude);
        MrRector.giveCertificateOfTopStudent(postgraduatedCumlaude);
    }
}
