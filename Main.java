import java.io.File;



public class Main {
    public static void main(String[] args){
        //create file
        File x = new File("votes");

        System.out.println("Hello world");
        if(x.exists()){
            System.out.println(x.getName() + " does exists");
        }
        else
        {
            System.out.println("The File does not exist");
        }
        

        int vote = 0;

    }
}
