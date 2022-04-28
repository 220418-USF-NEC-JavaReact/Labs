public class Race {

    public String twoKidsAndATruck(int k1, int k2, int t) {
        int distanceKid1 = Math.abs(k1 - t);
        int distanceKid2 = Math.abs(k2 - t);
        if(distanceKid1 < distanceKid2){
            return "Kid 1";
        } else if ( distanceKid1 == distanceKid2){
            return "Truck";
        } else {
            return "Kid 2";
        }

    }

}
