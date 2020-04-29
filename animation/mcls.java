
public class mcls {
        public static void main(String[] args) {
            cs();
        }
      public static void cs(){
          String penguinClearConsole = "clear";
      try{
          String os = System.getProperty("os.name").toLowerCase();
          System.out.println(os);

          //Operating system is based on Windows
          if (os.contains("Oh bn  ")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
              //If you are using eclipse uncomment the following line
            //for(int i = 0; i < 1000; i++) System.out.println();

          }else if (os.contains("osx")){//Operating system is Apple OSX based
              Runtime.getRuntime().exec("clear");
          }

      } catch(Exception e ){}
    }
  }//end cls
