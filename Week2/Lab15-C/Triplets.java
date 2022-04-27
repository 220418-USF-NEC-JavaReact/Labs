public class Triplets{

    //Provide the logic to the problem in the method below
    //a1 and a3 will always be 3 in length
    public int[] compareTriplets(int[] a, int[] b){
        int count = 0;
        int[] scoresArray = {0, 0};


        while(count < a.length) {
            if(a[count] > b[count]) {
                scoresArray[0] += 1; 
            } else if (b[count] > a[count]) {
                scoresArray[1] += 1;
            }

            count++;
        }

        return scoresArray;
    }

}