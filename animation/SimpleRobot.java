

import java.util.Scanner;

 public class SimpleRobot
 {
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_CLEAR_SCREEN = "\033[H\033[2J";
   public static final String ANSI_BOLD = "\u001B[1m";
   public static final String ANSI_BLINK = "\u001B[5m";
   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLUE = "\u001B[34m";
   public static final String ANSI_PURPLE = "\u001B[35m";
   public static final String ANSI_CYAN = "\u001B[36m";
   public static final String ANSI_WHITE = "\u001B[37m";
   public static final String ANSI_BLACK_BK = "\u001B[40m";

    public static void main(String[] args) throws InterruptedException
    {
         // Here we set up the initial positoion of the snake and tail.
         //int Xpos = 5;
         //int Ypos = 5;
		 int[] XposT = {5,5,5,5,5};  //XposT and YposT are the Tail positions of the robot
         int[] YposT = {5,4,3,2,1};   // all the same, no ititial tail. 5,4,3,2 would give initial tail.
		 // we have a variable that sets up the boundries of our snake and his environment.
		 int blockSize = 20;
         boolean more = true;
         Scanner keyboard = new Scanner(System.in);
         char direction = ' ';

		 //System.out.println("\033[H\033[2J"); //Clear Screen

     cls.cs();
		 //print initial instructions
		 System.out.println( "w up, s down, a left, d right, q to quit");
         // direction = keyboard.next().charAt(0);

         while(more){



            //Draw:
           //System.out.println("\033[H\033[2J"); //Clear Screen
		   cls.cs();
           for(int y=0; y < blockSize; y++) //
           {
            for(int x=0; x < blockSize; x++) // Print a column
            {
               if(((x == XposT[0]) && (y == YposT[0])) )
               {
                  System.out.print("H" );
				  //Print Head
               }
               else if (((x == XposT[1]) && (y == YposT[1]))
			   || ((x == XposT[2]) && (y == YposT[2])) || ((x == XposT[3]) && (y == YposT[3])) ||
			   ((x == XposT[4]) && (y == YposT[4]))) {
			   	System.out.print( "T" );
				// Print Tail
			   }
			   else
               {
                   System.out.print(" ");
               }
               System.out.print("   ");
            }
            System.out.println();

           }//End Draw
           System.out.println( "use: w up, s down, a left, d right, q to quit, then press enter.");



		 for(int i=4; i > 0; i--){
			XposT[i] = XposT[i-1];
			YposT[i] = YposT[i-1];
		    }

		//XposT[0] = Xpos;
		//YposT[0] = Ypos;

	    //User Input (Get New Head)
		switch ( keyboard.next().charAt(0)) {
         case 'w': // UP
		 case 'W':
            YposT[0]--;
			if(YposT[0] == -1) YposT[0] = blockSize-1;  //9 for raparound, -1 for bounce
            break;
         case 's': // down
		 case 'S':
             YposT[0]++;
			 if(YposT[0] == blockSize) YposT[0] = 0;  //1 for raparound, 10 for bounce
             break;
        case 'a': // Left
            XposT[0]--;
			if(XposT[0] == -1) XposT[0] = 0;  //10 for raparound, 1 for bounce
            break;
         case 'd': // Right
            XposT[0]++;
			if(XposT[0] == blockSize) XposT[0] = blockSize - 1;  //1 for raparound, 10 for bounce
            break;
         case 'q': // quit
            System.out.println("Thank you for playing.");
			more = false;
            break;
		 default :
		   System.out.println( " oops, use: w up, s down, a left, d right, q to quit");
		   System.out.println("Yikes, an incorrect letter nips at my tail.");
		   System.out.println("Hit any letter then enter to continue.");
		   keyboard.next();
		 }
      }  //end while
	  System.out.println(ANSI_RESET);
    }

}
