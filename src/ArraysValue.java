import java.util.Scanner;

public class ArraysValue {

    public static void main(String [] args){      // programme sum value of arrays

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];// integer value assign
        int sum = 0;
        System.out.println("Enter the elements :");

        for (int i = 0; i < 5 ; i++) {  // loop condition

            array[i] = scanner.nextInt();
        }
            for (int num : array ){  // array element for sum value

             sum =  sum + num;

             System.out.println("Sum of array element is : " + sum); // print value of sum


        }




        System.out.println("The total sum of the array element is "+ sum);//
    }

    }

