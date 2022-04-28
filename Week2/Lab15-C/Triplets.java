public class Triplets{

    //Provide the logic to the problem in the method below
    //a1 and a3 will always be 3 in length
    public int[] compareTriplets(int[] a, int[] b){
        int[] newArray = new int[a.length];
        
        for (int i=0; i <a.length; i++) {
            if(a[i] > b[i]) {
                newArray[0] += 1;
            } else if (a[i] < b[i]) {
                newArray[1] += 1;
            }
        }
        return newArray;
    } 

}
