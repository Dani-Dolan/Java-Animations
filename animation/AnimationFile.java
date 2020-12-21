
import java.lang.*;
import  java.util.*;
import  java.io.*;

public class AnimationFile{

  public static void main(String[]args) throws InterruptedException, IOException
  {
    //create arrays to hold each sprite
    ArrayList<String> sprite1 = new ArrayList<String>();
	  ArrayList<String> sprite2 = new ArrayList<String>();
	  ArrayList<String> sprite3 = new ArrayList<String>();

    //GetSprite will open the text file and read it into a sprite array.
	  GetSprite("sprite1.txt", sprite1);
	  GetSprite("sprite2.txt", sprite2);
    GetSprite("sprite3.txt", sprite3);

    //We animate the first sprite, then print the next two
    animate(sprite1);
		Thread.sleep(1000);
		print(sprite2);
		Thread.sleep(1000);
		print(sprite3);
   }  //end main

// Print prints th sprite
   public static void print(ArrayList<String> printable)
   {
     for(int k = 0; k < printable.size(); k++)
     {
		System.out.println(printable.get(k));
  }//end for
   }// end print

//Animate will move the sprite from right to left a certian amount.
   public static void animate(ArrayList<String> printable) throws InterruptedException
   {
       // the throws InterruptedException is because we talk to the system using the sleep command.
     int aCertianAmount = 12;
     for(int path = 0; path < aCertianAmount; path++)
     {
	   Thread.sleep(1000);
       for(int k = 0; k < printable.size(); k++)
       {
         for(int space = aCertianAmount; space > path; space--)
         {
          System.out.print(" ");
        }//end for
		  System.out.println(printable.get(k));
    }//end for
     }//end for
   }//end animate

   public static void GetSprite(String fileName, ArrayList<String> sprite) throws IOException
	{
	
	try
	{
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		//Then, you can use in.readLine(); to read a single line at a time. To read until the end, write a while loop as such:
		int i=0;
		String line;
		while((line = in.readLine()) != null)
		{
			sprite.add(line);
			i++;
		}
	in.close();
  
	}
	// If the file is not found.
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +
                fileName + "'");
		}
	}
}
