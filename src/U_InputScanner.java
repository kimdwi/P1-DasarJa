import java.util.Scanner;

public class U_InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name ? : ");
        String name = input.nextLine();
        System.out.println("My name is " + name);
    }

}
