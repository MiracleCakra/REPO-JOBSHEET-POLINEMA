import java.util.Scanner;

public class PemilihanPercobaan307 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        Scanner input08 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input08.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input08.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input08.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
                break;
            case '-':
                System.out.println(angka1 + " - " + angka2 + " = " + (angka1 - angka2));
                break;
            case '*':
                System.out.println(angka1 + " * " + angka2 + " = " + (angka1 * angka2));
                break;
            case '/':
                System.out.println(angka1 + " / " + angka2 + " = " + (angka1 / angka2));
                break;
            default:
                System.out.println("Operator tidak valid");
        }
    }
}
