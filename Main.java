import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        //cadidateList 4 candidate
        int[] candidateList = {4};
        //create file 
        // //read file
        
        try {
            File x = new File("votes");
            Scanner sc = new Scanner(x);
            System.out.println("file exists");

            //read file line by line
            while (sc.hasNext()) { 
                System.out.println(sc.next());
            }
            


        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");
        }

       



    }
}
