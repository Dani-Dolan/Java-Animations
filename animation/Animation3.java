
import java.lang.*;
import java.io.*;

public class Animation3{



  public static void main(String[]args) throws IOException, InterruptedException
  {
    //create sprites as string arrays.
      String[] sprite1 =
      {
       "                     .----.   ",
       "                    /'''''|   ",
       "               .---/~~~~~~|   ",
       "______________/___/ /^^^^^^^\\ ",
       "\\\\   =====)]  \\___| \\_______/ ",
       " \\\\_______________\\_/^^^^^^^^\\",
       "                  \\ \\________/",
       "                   \\~~~~~~~~\\ ",
       "                    \\________\\"
		};
	  String[] sprite2 =
      {
       "                .----.   ",
       "               /'''''|   ",
       "          .---/~~~~~~|   ",
       "##^^^^^^^^\\ ",
       "###^^^=)]  \\___| \\_______/ ",
       " ###^^^________\\_/^^^^^^^^\\",
       "             \\ \\________/",
       "              \\~~~~~~~~\\ ",
       "               \\________\\"
		};
	  String[] sprite3 =
      {
       "    #@$##^^^^<><><^%###       ",
       "   ######^^^^<><><###^^##     ",
       "   ###^^^@%@%@%***XXX###^^^   ",
       "   ####^^^^%^%^&*XXXX####^^^   ",
       "  #####$%$%$%^^^<><>XXX###^^^     ",
       " ####$$$$$%$%$%^^^<><><XXX##^^    ",
       "   ####$%$%$^^^<><>XXX##^^      ",
       "      ####$%$%$%<><>XXX         ",
       "             ###                "
		};


    animate(sprite1);
		Thread.sleep(1000);
		print(sprite2);
		Thread.sleep(1000);
		print(sprite3);
  }// end main

  /**
  The method print is used to print one element of a string array per line.
  It can be used for text or ascii art.
  @param String[] printable
  */
   public static void print(String[] printable) throws IOException, InterruptedException
   {
     cls();
     //System.out.println(ANSI_CLEAR_SCREEN + ANSI_RED + ANSI_BOLD);
     for(int k = 0; k < printable.length; k++)
     {
		System.out.println(printable[k]);
     }
	 //System.out.println(ANSI_RESET);
   }
/**
   The method Animate is used to print one element of a string array per line.
   with the addition of space before printing the array. The space is reduced by
   one each time and then printing continues.
   It can be used for text or ascii art.
   @param String[] printable
   */
   public static void animate(String[] printable) throws IOException, InterruptedException
   {
     cls();
     //System.out.println(ANSI_CLEAR_SCREEN + ANSI_GREEN + ANSI_BOLD);

     for(int path = 0; path < printable.length; path++)
     {
	   Thread.sleep(1000);
     cls();
     //System.out.println(ANSI_CLEAR_SCREEN + ANSI_GREEN + ANSI_BOLD);
       for(int k = 0; k < printable.length; k++)
       {
         for(int space = printable.length; space > path; space--)
         {
          System.out.print(" ");
         }
		  System.out.println(printable[k]);
       }
     }
     	 //System.out.println(ANSI_RESET);
   }// end animate

/**
 * a quick process that clears the screen  Currently only for windows users.
 */
    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }//end cls
}//end class
