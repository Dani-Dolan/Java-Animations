
import java.lang.*;
import  java.util.*;
import  java.io.*;

public class AnimationFile2{


  public static void main(String[]args) throws InterruptedException, IOException
  {
    
    ArrayList<String> sprite1 = new ArrayList<String>();
	  ArrayList<String> sprite2 = new ArrayList<String>();
	  ArrayList<String> sprite3 = new ArrayList<String>();


	  GetSprite("Sprite1.txt", sprite1);
	  GetSprite("Sprite2.txt", sprite2);
    GetSprite("Alien5.txt", sprite3);

    animate(sprite1);
		Thread.sleep(1000);
		print(sprite2);
		Thread.sleep(1000);
		print(sprite3);
   }  //end main

   /**
   The method print is used to print one element of a string array per line.
   It can be used for text or ascii art.
   @param String[] printable
   */
   public static void print(ArrayList<String> printable)throws IOException, InterruptedException
   {
     cls();
     for(int k = 0; k < printable.size(); k++)
     {
       System.out.print("   ||");
		System.out.println(printable.get(k));
     }
   }//end print

/**
   The method Animate is used to print one element of a string array per line.
   with the addition of space before printing the array. The space is reduced by
   one each time and then printing continues.
   It can be used for text or ascii art.
   @param String[] printable
   */
   public static void animate(ArrayList<String> printable) throws IOException, InterruptedException
   {
     cls();

     for(int path = 0; path < printable.size(); path++)
     {
	   Thread.sleep(1000);
	  cls();


    System.out.println();

       for(int k = 0; k < printable.size(); k++)
       {
         for (int m=0; m>5  ; m++ ) {
           System.out.println();
         }
         System.out.print("   ||");
         for(int space = printable.size(); space > path; space--)
         {
          System.out.print(" ");
         }
		  System.out.println(printable.get(k));
       }
     }

   }//end animate

   public static void GetSprite(String fileName, ArrayList<String> sprite)throws IOException
	{
	
	try
	{
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		
		int i=0;
		String line;
		while((line = in.readLine()) != null)
		{
			sprite.add(line);
			i++;
		}// end while
	in.close();
  }//end try
	// If the file is not found.
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                fileName + "'");
		}// end class
	}//end GetSprite

 
}//end class
