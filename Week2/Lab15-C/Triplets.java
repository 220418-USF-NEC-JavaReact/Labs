public class Triplets {

    //Provide the logic to the problem in the method below
    //a1 and a3 will always be 3 in length
    public int[] compareTriplets(int[] a, int[] b) {
        int[] points = {0, 0};
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                points[0]++;
            } else if (a[i] < b[i]) {
                points[1]++;
            }
        }
        return points;
    }
}