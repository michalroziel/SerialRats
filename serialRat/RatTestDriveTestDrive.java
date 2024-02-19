import java.io.*;


public class RatTestDriveTestDrive {


    public static void main(String[] args){


        
        File myFile = new File("/Users/michalroziel/Documents/htwprog/serialRat/Rat.ser");
        
        try{

            FileInputStream fis = new FileInputStream(myFile);


            ObjectInputStream ois = new ObjectInputStream(fis);

            Rat readOutRat = (Rat) ois.readObject();

            System.out.println(readOutRat);


        }

        catch ( ClassNotFoundException classNotFoundEx){

            System.out.println(" class not found exception caught ! ");

            classNotFoundEx.printStackTrace();


        }


        catch ( IOException readOutException ){

            System.out.println(" IOException caught ! ");



        }






    }



    
}
