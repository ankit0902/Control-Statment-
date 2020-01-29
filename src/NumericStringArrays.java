import java.util.Arrays;

public class NumericStringArrays {

    public static void main (String[] args){

        int[] data1 = {10,5,20,15,30};   //programme to sort a numeric array and a string array
        String[] data2 = {"John","Andrew","Chris","Darren"};

        System.out.println("Original value: " + Arrays.toString(data1));
        Arrays.sort(data1);
        System.out.println("Sorted Value: " + Arrays.toString(data1)); // method to ascending numbers
        Arrays.sort(data1);

        System.out.println("Original Value :" + Arrays.toString(data2));
        Arrays.sort(data2);
        System.out.println("Sorted Value: " + Arrays.toString(data2)); // method to ascending string
        Arrays.sort(data2);




    }
}
