import java.util.Scanner;

public class AmstrongNumber {

    public static void main(String[] args){

        int num,number,temp,total =0;               // Wap to input any 3 digit number and check if it is Armstrong number or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 digit number: ");// Function to check whether the given number is armstrong or not


        num= scanner.nextInt();
        scanner.close();
        number = num;

        for (;number!=0;number/=10) {

            temp = number % 10;
            total= total + temp * temp * temp;
        }

        if(total==num)
        {
            System.out.println(num + ": is an Armstrong Number") ;
        }
        else
        {
            System.out.println(num + " : is not an Armstrong Number");
        }
    }



}
