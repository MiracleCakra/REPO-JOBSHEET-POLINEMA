import java.util.Scanner;

public class PemilihanPercobaan307 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input07.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input07.nextDouble();
        System.out.print("Masukkan operator (+,-,*,/): ");
        operator = input07.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
            case '-':
                System.out.println(angka1 + " - " + angka2 + " = " + (angka1 - angka2));
                break;
            case '*':
                System.out.println(angka1 + " * " + angka2 + " = " + (angka1 * angka2));
                break;
            case '/':
                System.out.println(angka1 + " / " + angka2 + " = " + (angka1 / angka2));
                break;
        }
    }
}