import java.util.Scanner;

public class WordNSpaceCount {


        // Ans 10: enter any String and count how many total number of words and total number of spaces in that sentence
        public static void main(String[] args){



            Scanner scanner = new Scanner(System.in);
            System.out.println ("Enter Any Sentence  : ");
            String str = scanner.next();
            int count  = 0 ;
            char[] c= str.toCharArray(); // convert string to char array
            for (int i = 0; i < str.length() ; i++) { // loop till end of str

                if (c[i]!= ' ') count++ ;

                System.out.println("No of char are " + count); // print no of char
                System.out.println("No of spaces are" + (str.length() - (count)));// print no of spaces

                String words[] = str.split("");

            }


        }

}
