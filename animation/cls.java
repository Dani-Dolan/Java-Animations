/**
 * a quick process that clears the screen  Currently only for windows users.
 */
    public class cls {
      public static void cs(){
      try{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Your screen is clear!");
      } catch(Exception e ){}
    }
  }//end cls
