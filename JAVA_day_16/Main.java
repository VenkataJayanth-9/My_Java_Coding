import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    record GrocaryItems(String name, String type, int count){
        GrocaryItems(String name){
            this(name, "Dairy", 1);
        }
    }
    public static void main(String[] args){
        Object[] list = new Object[3];
        list[0] = new GrocaryItems("Orages", "HP-Oranges", 5);
        list[1] = new GrocaryItems("Apple", "Kashmir-Apple", 100);
        System.out.println(Arrays.toString(list));
        ArrayList<GrocaryItems> glist = new ArrayList<>();
        glist.add(new GrocaryItems("Butter"));
        glist.add(new GrocaryItems("Milk"));
        System.out.println(glist);
        glist.add(0, new GrocaryItems("Guva"));
        System.out.println(glist);
        glist.remove(1);
        System.out.println(glist);
    }
}
