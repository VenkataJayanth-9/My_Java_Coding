import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Lists {
    public static void main(String[] args) {
        String[] items = {"Apple", "Orange", "Banana", "Mango"};
        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Pineapple");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        groceries.addAll(nextList);
        System.out.println(groceries);

        groceries.removeAll(List.of("pickles", "cheese"));
        System.out.println(groceries);


        System.out.println(groceries.get(2));


        groceries.retainAll(List.of("mustard", "Apple"));
        System.out.println(groceries);

        groceries.addAll(List.of("a", "b", "c", "d", "e"));
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
    }
}
