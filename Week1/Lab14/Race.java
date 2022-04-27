public class Race {

    public String twoKidsAndATruck(int k1, int k2, int t) {
        int diff1 = Math.abs(k1 - t);
        int diff2 = Math.abs(k2 - t);
        if (diff1 < diff2){
            return "Kid 1";
        }else if (diff1 > diff2){
            return "Kid 2";
        }
        return "Truck";
    }

}
