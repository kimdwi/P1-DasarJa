import java.io.IOException;
import java.util.Scanner;

public class V_InputTypeScanner {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String name= input.nextLine();
        System.out.print("Masukkan umur : ");
        String age = input.nextLine();
        System.out.print("Masukkan tinggi badan : ");
        String height = input.nextLine();
        System.out.print("Sudah menikah (true/false): ");
        String married = input.nextLine();
        System.out.println("Nama:" + name);
        System.out.println("Umur : " + Integer.parseInt(age));
        System.out.println("Tinggi Badan:" + Double.parseDouble(height));
        System.out.println("Sudah Menikah: " + Boolean.parseBoolean(married));
    }
}
