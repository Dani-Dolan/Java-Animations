
public class Animation{


  public static void main(String[]args)
  {
   
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

      
        print(sprite);
        print(spriteReverse);


  }// end main

   public static void reverse(String[] sprite)
   {

        for(int i = 0; i < sprite.length; i++)
        {
            String reverse = new StringBuffer(sprite[i]).reverse().toString();
            sprite[i] = reverse;
        }
   }//end reverse

  
   public static void print(String[] printable)
   {
     for(int k = 0; k < printable.length; k++)
     {
		System.out.println(printable[k]);
     }
   }// end Print


}
