import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        //cadidateList 4 candidate
        int[] candidateList = {5};
        //create file 
        // //read file
        
        try {
            File x = new File("votes");
            Scanner sc = new Scanner(x);
            System.out.println("file exists");

            //read file line by line
            while (sc.hasNext()) { 
                int vote = Integer.parseInt(sc.next());
                System.out.println(vote);
                candidateList[vote] += 1;
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");
        }

       // print list
       System.out.println(candidateList);


    }
}
