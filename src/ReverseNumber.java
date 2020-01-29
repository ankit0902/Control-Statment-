import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){

        int n,reverse = 0;     // Ans 6 Wap to input any five digit number and then reverse the number

        System.out.println("Enter an integer to reverse number");

        Scanner in = new Scanner(System.in); // user input
        n= in.nextInt(); // input would be stored in number

        while(n!=0)
        {
            reverse = reverse *10;
            reverse = reverse + n%10;
            n= n/10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }

}
