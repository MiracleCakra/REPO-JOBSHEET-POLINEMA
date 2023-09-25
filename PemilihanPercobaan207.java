import java.util.Scanner;

public class PemilihanPercobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Nilai UAS: ");
        float uas = input07.nextFloat();
        System.out.print("Nilai UTS: ");
        float uts = input07.nextFloat();
        System.out.print("Nilai kuis: ");
        float kuis = input07.nextFloat();
        System.out.print("Nilai Tugas: ");
        float tugas = input07.nextFloat();
        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        if (total >= 80 && total <= 100) {
            System.out.println("Nilai huruf: A");
        } else if (total >= 73 && total < 80) {
            System.out.println("Nilai huruf: B+");
        } else if (total >= 70 && total < 73) {
            System.out.println("Nilai huruf: B");
        } else if (total >= 65 && total < 70) {
            System.out.println("Nilai huruf: C+");
        } else if (total >= 60 && total < 65) {
            System.out.println("Nilai huruf: C");
        } else if (total >= 50 && total < 60) {
            System.out.println("Nilai huruf: D");
        } else { // total < 50
            System.out.println("Nilai huruf: E");
        }

        System.out.println("Nilai akhir: " + total + " sehingga " + message);
    }
}