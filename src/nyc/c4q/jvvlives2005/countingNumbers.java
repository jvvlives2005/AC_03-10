package nyc.c4q.jvvlives2005;

/** Counting numbers
 * Created by c4q-joshelynvivas on 3/10/15.
 */
import java.util.Scanner;

public class countingNumbers {
    public static void main(String[] args){
       System.out.print("Count to:");
        System.out.println();
        for (int i = 0; i <= 19; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("Count to:");//how to enter
        for (int i = 0; i <= 8; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("Count to:");
        for (int i = 0; i <= 25; i++){
            System.out.print(" " + i);
        }
        
       /* Scanner keyboard = new Scanner(System.in); //got lost here

        System.out.print("Count from: ");
        int start = keyboard.nextInt();
        System.out.print("Count to: ");
        int max = keyboard.nextInt();
        System.out.print("How much?");
        int much = keyboard.nextInt();

        for (int i = start; i <= max; i = much + i) {
            System.out.print(" " + i);
        }*/
    }
}
