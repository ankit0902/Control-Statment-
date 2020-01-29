import java.util.Scanner;

public class MultiplicatTable {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // user input any number from keyboard


        System.out.println("Enter Input Number :"); // print command
        int num1 = scanner.nextInt();

        for (int i = 0; i < 9 ; i++) {    // change output here

            System.out.println(num1 + "x " + (i+1) + " = " + (num1 * (i+1)));


        }
    }
}
