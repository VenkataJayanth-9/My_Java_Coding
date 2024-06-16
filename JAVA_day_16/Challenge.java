import java.util.*;

public class Challenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while(flag){
            Start();
            switch(Integer.parseInt(scanner.nextLine())){
                case 1:
                    addItems(groceries);
                    break;
                case 2:
                    removeItems(groceries);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add items(s) [seperate items by comma]: ");
        String[] items = scanner.nextLine().split(",");

        for(String i : items){
            String tri = i.trim();
            if(groceries.indexOf(tri)<0){
                groceries.add(tri);
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }
    public static void removeItems(ArrayList<String> groceries){
        System.out.println("Enter item you want to remove: ");
        String item = scanner.nextLine();
        groceries.remove(item);
    }

    public static void Start(){
        String s = """
                Available actions:
                 0 - to shutdown
                 1 - to add items
                 2 - to remove items
                 Enter your input here:""";
        System.out.println(s+" ");
    }
}