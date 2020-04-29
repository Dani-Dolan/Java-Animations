
public class Animation1{

  public static void main(String[]args)
  {
      String[] sprite =
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
        animate(sprite);
   }// end main

   /**
   The method Animate is used to print one element of a string array per line.
   with the addition of space before printing the array. The space is reduced by
   one each time and then printing continues.
   It can be used for text or ascii art.
   @param String[] printable
   */
   public static void animate(String[] printable)
   {
     //starting point is how far to the right we start.
     int startingPoint = 10;

     for(int path = 0; path < startingPoint; path++)
     {
       //this loop starts the print of each sprite
       for(int k = 0; k < printable.length; k++)
       {
         // this loop prints each line of the sprite
         for(int space = startingPoint; space > path; space--)
         {
           //this loop prints the spaces before each sprite
          System.out.print(" ");
         }
		  System.out.println(printable[k]);
      }//end for
     }//end for

   }//end Animate
}//end Class
