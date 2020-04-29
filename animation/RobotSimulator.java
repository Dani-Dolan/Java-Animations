import java.util.Scanner;

public class RobotSimulator
{

	private static int x;
	private static int y;


	public static void main(String args[])
	{
		// Robot initial Position
		x = 5;
		y = 5;

		cls();
		print();

		Scanner kbReader = new Scanner(System.in);
		System.out.println("use wasd for direction.");

		String direction = kbReader.nextLine();

    while(isGoodMove(direction)){
			move(direction);
			direction = kbReader.nextLine();
		}
		System.out.println("Thanks for Playing!");
	}


	public static boolean isGoodMove(String direction)
	{
		boolean returnValue = false;

		if (direction.equalsIgnoreCase("W") || direction.equalsIgnoreCase("A") || direction.equalsIgnoreCase("S") || direction.equalsIgnoreCase("D") ||
		    direction.equalsIgnoreCase("Q") || direction.equalsIgnoreCase("E") || direction.equalsIgnoreCase("Z") || direction.equalsIgnoreCase("C"))
		{
			returnValue = true;
    	}
    	return returnValue;
	}


	public static void move(String direction)
	{
		cls();
		if(isGoodMove(direction))
		{
			if (direction.equalsIgnoreCase("w"))
			{
				--x;
			}
			if (direction.equalsIgnoreCase("a"))
			{
				--y;
			}
			if (direction.equalsIgnoreCase("s"))
			{
        		++x;
			}
     		if (direction.equalsIgnoreCase("d"))
     		{
        		++y;
     		}
     		if (direction.equalsIgnoreCase("q"))
     		{
        		++y;
        		--x;
     		}
     		if (direction.equalsIgnoreCase("e"))
     		{
        		++y;
        		++x;
     		}
     		if (direction.equalsIgnoreCase("z"))
     		{
        		--y;
        		--x;
     		}
     		if (direction.equalsIgnoreCase("c"))
     		{
        		--y;
        		++x;
     		}
    	print();
    	}
	}// end move

	public static void print()
	{
  		for(int row = 0; row < 10; row++)
  		{
  			//System.out.print(row);
     		for(int column = 0; column < 10; column++)
     		{
        		if((column == y) && (row == x))
          		{
            		System.out.print("0");
          		}
          		else
          		{
            		System.out.print("_");
          		}
       	}
       	System.out.println();
     	}
	}//end print

	/**
	 * a quick process that clears the screen  Currently only for windows users.
	 */
			public static void cls()  {
				try{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} catch(Exception e ){}
			}//end cls

}// End RobotSimulator
