public class Triplets{

    //Provide the logic to the problem in the method below
    //a1 and a3 will always be 3 in length
    public int[] compareTriplets(int[] a, int[] b){
        int[] compare = new int[2];
        int apt = 0;
        int bpt = 0;


        for (int i = 0; i < a.length; i++) {

            if (a[i] > b[i]) {
                apt++;

            } else if (b[i] > a[i]) {
                bpt++;
            }

        }
        
        compare[0] = apt;
        compare[1] = bpt;

        return compare;
    }

}