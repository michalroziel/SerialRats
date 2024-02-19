import java.io.*;
public class RatTestDrive {
   
    
    public static void main(String[] args) {
      
      
        Rat myRat = new Rat(4,2);
        
        System.out.println(myRat);
      
      

      File myFile = new File("/Users/michalroziel/Documents/htwprog/serialRat/Rat.ser");


      try {

        FileOutputStream fos = new FileOutputStream(myFile);

        ObjectOutputStream oos = new ObjectOutputStream(fos);


        oos.writeObject(myRat);




      }

      catch ( IOException inOutException){

        System.out.println( " IOEXception caught ! ");
        
        inOutException.printStackTrace();

      }

      catch ( Exception exceptionFound){

        System.out.println("  Exception caught ! ");

        exceptionFound.printStackTrace();

      }

      finally {

        System.out.println(" finally block reached ! ");

      }





  }



  
}
