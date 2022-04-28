public class Race {

    public String twoKidsAndATruck(int k1, int k2, int t) {
        int[] distance = {Math.abs(t-k1), Math.abs(t-k2)};
        String res = "";
        if(distance[0]<distance[1]){
            res = "Kid 1";
        } else if(distance[0]>distance[1]){
            res = "Kid 2";
        } else {
            res = "Truck";
        }

        return res;
    }

}
