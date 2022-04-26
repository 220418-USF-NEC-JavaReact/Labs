public class Race {

    public String twoKidsAndATruck(int k1, int k2, int t) {
        if(Math.abs(t-k1)<Math.abs(t-k2)){
            return "Kid 1";
        }else if(Math.abs(t-k1)>Math.abs(t-k2)){
            return "Kid 2";

        }else {
            return "Truck";

        }
    }

}
