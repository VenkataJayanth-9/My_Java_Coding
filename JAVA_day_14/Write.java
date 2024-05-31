import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
public class Write {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("Text.txt");
            writer.write("Nice to meet you");
            writer.close();
            System.out.println("Succesful");
        }catch (Exception e){
            System.out.println("Error"+e);
        }
    }
}
