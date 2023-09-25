import java.util.Scanner;

public class PemilihanPercobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Nilai uas: ");
        float uas = input07.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input07.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input07.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input07.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}