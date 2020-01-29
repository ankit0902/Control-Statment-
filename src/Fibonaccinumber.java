import java.util.Scanner;

public class Fibonaccinumber{

    public static void main(String[] args)
    {

        int n, first = 0,next = 1;

        System.out.println("Enter how may fibonacci numbers to print");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("The first " + n + " Fibonacci numbers are: ");
        System.out.print(first + " " + next);
        int i = 1;
        while (i<n-1) // New Number should be the sum of last number
        {
            int sum = first + next;// each iteration ,we are assigning second number to first number
                                   // and sum of last two number
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }

    }
}



