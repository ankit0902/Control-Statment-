import java.util.Scanner;

public class FindSpecificValue {


    public static void main(String[] args){

        int[] arraynumbers = {1,2,3,4,5};    //  Write a Java Programme to test if an array contains a specific value

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value"); // print method
        int num = sc.nextInt();

        for (int x = 0; x < arraynumbers.length; x++) // get value
        {
            if (arraynumbers[x] == num) // check if this value is present in arrays
            {
                System.out.println("Value exists in array!"); // print array
            }else{
                System.out.println("Value doesn't exists in array!");
            }
        }

    }

}



