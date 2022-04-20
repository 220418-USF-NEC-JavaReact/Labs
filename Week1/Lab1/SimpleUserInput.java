
import java.util.Scanner;

class SimpleUserInput{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favourite month?");
        String month = scan.nextLine();
        System.out.println("You chose month: " + month);
        switch(month){
            case "January":
            System.out.println("Too cold");
            break;
            default:
    System.out.println("We dont understand your month");
                   }
    }

}