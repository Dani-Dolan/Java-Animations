
public class Animation{


  public static void main(String[]args)
  {
    //here we create 2 sprites
      String[] sprite =
      {
       "                     .----.       ",
       "                    /'''''|       ",
       "               .---/~~~~~~|       ",
       "______________/___/ /^^^^^^^\\    ",
       "\\\\   =====)]  \\___| \\_______/ ",
       " \\\\_______________\\_/^^^^^^^^\\  ",
       "                  \\ \\________/  ",
       "                   \\~~~~~~~~\\   ",
       "                    \\________\\    "};

        String[] spriteReverse =
      {
        "   .----.    ",
       "   |'''''\\   ",
       "   |~~~~~~\\---.    ",
      " /^^^^^^^\\ \\___\\______________ ",
      " \\_______/ |___/  ])=====   // ",
      "/^^^^^^^^\\_/_______________//",
      "\\________/ /     ",
      " /~~~~~~~~/            ",
      "/________/    "};

      //next we send the sprites to a print method
        print(sprite);
        //you can uncomment the next to lines and see that
        //reversing a string does not always give the desired results
        // reverse(sprite);
        // print(sprite);
        print(spriteReverse);


  }// end main
/*
Reverse was written to show that while it is possible to reverse the
strings, the output is not a mirror immage of the input.   For example
 \@/ should look the same reversed, yet it looks like /@\
*/
   public static void reverse(String[] sprite)
   {

        for(int i = 0; i < sprite.length; i++)
        {
            String reverse = new StringBuffer(sprite[i]).reverse().toString();
            sprite[i] = reverse;
        }
   }//end reverse

   /*
   Our print method will print each string in an array of strings*/
   public static void print(String[] printable)
   {
     for(int k = 0; k < printable.length; k++)
     {
		System.out.println(printable[k]);
     }
   }// end Print


}
