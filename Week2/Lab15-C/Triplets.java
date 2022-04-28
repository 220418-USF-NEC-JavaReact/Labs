public class Triplets{

    //Provide the logic to the problem in the method below
    //a1 and a3 will always be 3 in length
    public int[] compareTriplets(int[] a, int[] b){

        int[] result = {0, 0};
        for(int i = 0; i < a.length; i++){
            if(a[i] > b [i]){
                result[0] += 1;
            } else if (b[i] > a[i]) {
                result[1] += 1;
            }
        }
        return result;
    }

}