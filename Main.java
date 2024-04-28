import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science fiction, or Q for quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }


    }
}
