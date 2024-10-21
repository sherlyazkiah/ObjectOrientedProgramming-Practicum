package WEEK7;

public class Segitiga {
    int sudut = 180;

    // Overloaded method 1: One parameter (int)
    int totalSudut(int sudutA) {
        return sudut - sudutA;
    }

    // Overloaded method 2: Two parameters (int)
    int totalSudut(int sudutA, int sudutB) {
        return sudut - (sudutA + sudutB);
    }

    // Overloaded method 3: Three parameters (int)
    int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloaded method 4: Two parameters (int), return type is double
    double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }
}
