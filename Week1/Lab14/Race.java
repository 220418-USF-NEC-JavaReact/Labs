import java.lang.Math;
public class Race {
    public String twoKidsAndATruck(int k1, int k2, int t) {

        int Dist1;
        int Dist2;

        Dist1 = Math.abs(k1-t);
        Dist2 = Math.abs(k2-t);

        if (Dist1 < Dist2) {
            return "Kid 1";
        } else if (Dist2 < Dist1) {
            return "Kid 2";
        } else {
            return "Truck";
        }
    }

}
