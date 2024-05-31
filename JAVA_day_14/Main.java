import java.io.IOException;
import java.io.File;
public class Main {
    public static void main(String[] args){
        try{
            File file = new File("Text.txt");
            if(file.createNewFile()){
                System.out.println("Succesful "+file.getName());
            }else{
                System.out.println("File already exist...");
            }
        }catch (Exception e){
            System.out.println("Error....."+e);
        }
    }
}
