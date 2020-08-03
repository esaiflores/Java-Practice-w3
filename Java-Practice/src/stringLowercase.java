import java.util.Scanner;

public class stringLowercase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        This has the user put in a String
        System.out.print("Input a String: ");

//        This means the user inputed text will be called line
        String line = in.nextLine();

//        This is converting line to lowercase
        line = line.toLowerCase();

//        system printing out the new lowercased line
        System.out.println(line);
    }
}
