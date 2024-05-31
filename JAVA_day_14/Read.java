import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Read {
    public static void main(String[] args){
        try{
            File file = new File("Text.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (Exception e){
            System.out.println("Error....");
            System.out.println(e);
        }
    }
}
