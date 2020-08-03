import java.util.Scanner;

public class evenOrOdd {

    public static void main(String args[]){

        //scanner to get input from user
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter any number : ");

        //return the user input as integer
        int number = console.nextInt();

        //if you can divide by 2 and not have a remainder then it is even
        if((number %2)==0){
            System.out.printf("number %d is an even number %n" , number);

        } else{
            //number is odd in Java
            System.out.printf("number %d is an odd number %n", number);
        }


    }


}
