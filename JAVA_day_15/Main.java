import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] array = getRandomArray(10);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        String[] names = new String[]{"Venkata", "Jayanth", "Ram", "Krishna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        if(Arrays.binarySearch(names,"Venkata")>=0){
            System.out.println("Found the element.");
        }
        else{
            System.out.println("nil");
        }
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        if(Arrays.equals(array1, array2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not-Equal");
        }
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i<len; i++){
            newInt[i] = random.nextInt();
        }
        return newInt;
    }
}
