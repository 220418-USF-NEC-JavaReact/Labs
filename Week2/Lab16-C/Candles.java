public class Candles {

    //Provide the logic for the problem below
    //The candles array can be any size
    public int candles(int candles[]){
        int largest = 0;
        int count = 0;

        /*find the largest number in the list*/
        largest = candles[0];
        for(int i = 0; i < candles.length; i++) {
            if(candles[i] > largest) {
                largest = candles[i];
            }
        }

        for(int i = 0; i < candles.length; i++) {
            if (candles[i] == largest) {
                count++;
            }
        }
        return count;
    }

}
