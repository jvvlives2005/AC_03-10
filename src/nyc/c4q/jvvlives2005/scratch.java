package nyc.c4q.jvvlives2005;

/** Using for loops with Greg
 * Created by c4q-joshelynvivas on 3/10/15.
 */
public class scratch {
    public static void main(String[] args){
        /*for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i <= 100){
            i++;
            System.out.println(i);
        }*/

        /*for (int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);*/
        String text= "hello world";
        int len = text.length();
        System.out.println(len);

        for (int i = 0; i < text.length();i++){
            char currentLetter = text.charAt(i);
            System.out.println(currentLetter);
        }
        }
    }

