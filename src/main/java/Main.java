/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;


import static java.lang.Math.max;
import static java.lang.Math.random;


public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Random rand = new Random();

       boolean win = false;
        int guess = 0;
        int answer = rand.nextInt(10);

         int maxAttempts = 3;
        //  guess = type.nextInt();
        System.out.println("Pick a number:");

        //ystem.out.println(answer);
        int attemptsNum =0;
        do {
            guess = number.nextInt();
            if (guess == answer) {

                win = true;
                System.out.println("Correct");
                 //maxAttempts+=1;


            }
            else {

                if (guess > answer) {
                    System.out.println("too large");
                   //maxAttempts+=1;
                } else {
                    System.out.println("too small");
                   //maxAttempts+=1;
                }

            }
        } while (win == false && ++attemptsNum <maxAttempts);
        if(attemptsNum== maxAttempts)
            System.out.println("You failed  " + maxAttempts);
    }
}


// if check win)
//esle if (g > answer
//too big
     //   else too small )












        /*int guess = 1;
        int answer = rand.nextInt(4);

        System.out.println("Pick a number:");
        guess = number.nextInt();

        //  guess = type.nextInt();

        if (guess <= answer)
            {

                System.out.println("To small");


            }
            if (guess >= answer) {
                System.out.println("too large");
            }

            if (guess == answer)
                System.out.println("correct");
        }

    }

*/







        /*int guess = 1;
        int answer = rand.nextInt(4);

        //  guess = type.nextInt();

        do {
            System.out.println("Pick a number:");
            guess = number.nextInt();
        }
            while (guess >= answer);
                System.out.println("too large");
                 if (guess <= answer) ;{
                System.out.println("too small");

        } if (guess != answer) ;

            System.out.println("Correct");


        }

    }
*/