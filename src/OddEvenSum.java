import java.util.Scanner;

public class OddEvenSum {   // programme to find out even or odd number

    public static void main(String[] args){

        int n, sumE = 0,sumO = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for array");

        n= scanner.nextInt();   // reads user input
        int[] a = new int[n];
        System.out.println("Enter the number "); // user put any input from keyboard

        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 ==0) {

                sumE = sumE + a[i]; // sum of even number
            }

            else {
                sumO = sumO + a[i];  // sum of odd number
            }
        }
                System.out.println("Sum of Even Numbers:" + sumE);
                System.out.println("Sum of Odd Numbers : " + sumO);

    }
}

