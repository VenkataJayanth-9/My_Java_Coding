import java.util.Arrays;

//Let us understand how call by reference will work
public class CallByRef {
    public static void main(String[] args){
        int[] array1 = new int[5];//here we are just creating a null array.
        int[] array2 = array1;//we have created an another null array by passing the array1 address.
        //array1 -->> is just an object
        //it gives the refers into the memory where the array is being stored.
        //if we do any changes on array2 then it also changes on array1 because both the objects are pointing to the same
        //memory address.

        System.out.println("Array1 before: "+Arrays.toString(array1));
        System.out.println("Array2 before: "+Arrays.toString(array2));

        array2[0] = 1;
        System.out.println("Array1 after: "+Arrays.toString(array1));
        System.out.println("Array2 after:  "+Arrays.toString(array2));
    }
}
