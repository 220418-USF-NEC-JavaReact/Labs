import java.util.Arrays;

public class Candles {

    //Provide the logic for the problem below
    //The candles array can be any size
    public int candles(int candles[]){
        Arrays.sort(candles);
        int len = candles.length-1;
        int tallest = candles[len];
        int res = 0;
        try{
            while(tallest==candles[len]){
                res++;
                len--;
            }
        } catch (IndexOutOfBoundsException e){
            //Ignore
        }
        return res;
    }
}
