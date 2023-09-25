import java.util.Scanner;

public class PemilihanPercobaan107 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input07.nextInt();
        
        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);
    }
}