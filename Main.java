import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        //cadidateList 4 candidate
        int[] candidateList = {0,0,0,0,0,0};
        
        // //read file
        
        try {
            //create file 
            File x = new File("votes");
            Scanner sc = new Scanner(x);
            System.out.println("votes file exists");

            //read file line by line
            while (sc.hasNext()) { 
                int vote = Integer.parseInt(sc.next());
                System.out.println(vote);
                candidateList[vote-1] += 1;
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("votes file does not exist");
        }

       // print list
       System.out.println(candidateList + " object address");
    
       for (int i = 0; i < candidateList.length; i++) {
           System.out.println(candidateList[i]);
       }

    }
}
