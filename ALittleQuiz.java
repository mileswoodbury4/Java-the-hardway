import java.util.Scanner;

    public class ALittleQuiz {

        public static void main( String[] args ) {

            Scanner keyboard = new Scanner(System.in);

            int q1, q2, q3, n = 0;

            System.out.println( "Ready for the quiz dawg? " );
            System.out.println( "ight lets go !" );

            System.out.println();
            System.out.println( "(Q1) Who was #1 NHL draft pick?" );
            System.out.println( "\t 1) Kappo Kakko" );
            System.out.println( "\t 2) Jack hughes" );
            System.out.print( "> " );
            q1 = keyboard.nextInt();

            if ( q1 == 1 ) {
                System.out.println( "Wrong you dingleberry!" );
            }
            else if ( q1 == 2 ) {
                System.out.println( "You are correct dawg." );
                n++;
            }
            else {
                System.out.println( "1 or 2." );
            }
            System.out.println();

            System.out.println( "(Q2) Who won the stanely cup in 2019?" );
            System.out.println( "\t 1) St Louis Blues" );
            System.out.println( "\t 2) Boston Bruins" );
            System.out.print( "> " );
            q2 = keyboard.nextInt();

            if ( q2== 1 ) {
                System.out.println( "yup the blues won the cup." );
                n++;
            }

            else {
                System.out.println( "the bruins didnt win the cup");
            }
            System.out.println();

            System.out.println( "(Q3) Which team picked Jack Hughes?" );
            System.out.println( "\t 1) New Jersey Devils");
            System.out.println( "\t 2) New York Rangers");
            System.out.print( "> " );
            q3 = keyboard.nextInt();

            if ( q3== 1 ) {
                System.out.println( "You are correct sir");
                n++;
            }
            else if ( q3== 2 ) {
                System.out.println( "Wrong which means that you guessed on the first question");
            }
            else {
                System.out.println( "1 or 2");
            }
            System.out.println();


            System.out.println( "Overall, you got " + n + " out of 3 correct." );
            System.out.println( "Thanks for playin dawg");

        }
    }
