package nyc.c4q.jvvlives2005;

/**
 * FizzBuzz
 * Created by c4q-joshelynvivas on 3/10/15.
 */
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){ // got lost here
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 )
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
            System.out.println("Fizz");
            else if (i % 5 == 0)
            System.out.println("Buzz");
            else
                System.out.println(i);

            }
        }
    }


