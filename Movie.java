public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" file");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}


class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Action scene","Hanu-Man scene", "Inspiring");
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Funny scene","Somthing even funny happens scene", "Good movie");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Fiction scene","Bad Alien do bad stuff", "Super hero comes and save earth.");
    }
}