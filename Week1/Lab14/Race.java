import java.lang.Math;
public class Race {

    public String twoKidsAndATruck(int k1, int k2, int t) {
        if(Math.abs(k1 - t) < Math.abs(k2 - t)) {
            return "Kid 1";
        } else if (Math.abs(k1 - t) > Math.abs(k2 - t)) {
            return "Kid 2";
        } else {
            return "Truck";
        }
    }

}
