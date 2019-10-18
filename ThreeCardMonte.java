import java.util.Scanner;
    import java.util.Random;

    public class Monte {

        public static void main( String[] args ) {

            Scanner keyboard = new Scanner(System.in);
            Random r = new Random();

            int door = 1 + r.nextInt(3);

            System.out.println( "Your on a gameshow dawg." );
            System.out.println( "You gotta guess whih door the cars behind man." );
            System.out.println( "Pick the right one and the car is yours." );
            System.out.println();
            System.out.println( "Which door do you think it is?" );
            System.out.println();
            System.out.println( "-------  -------  -------" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "|  1  |  |  2  |  |  3  |" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "|     |  |     |  |     |" );
            System.out.println( "-------  -------  -------" );
            System.out.println();
            System.out.print( "> " );
            int choice = keyboard.nextInt();
            System.out.println();

            if ( choice == door ) {
                System.out.println( "Winner winner chicken dinner!" );
            }

            else if ( choice > door ) {
                System.out.println( "the cars mine baby! You get nothing!" );
            }

            else if ( choice < door ) {
                System.out.println( "the cars mine baby! You get nothing!" );
            }

            else {
                System.out.println( "You awful holy." );
            }


            System.out.println();

            if ( door == 1 ) {
                System.out.println( "-------  -------  -------" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "| car |  |  2  |  |  3  |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "-------  -------  -------" );
            }

            else if ( door == 2 ) {
                System.out.println( "-------  -------  -------" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|  1  |  | car |  |  3  |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "-------  -------  -------" );
            }

            else if ( door == 3 ) {
                System.out.println( "-------  -------  -------" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|  1  |  |  2  |  | car |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "|     |  |     |  |     |" );
                System.out.println( "-------  -------  -------" );
            }
        }
    }