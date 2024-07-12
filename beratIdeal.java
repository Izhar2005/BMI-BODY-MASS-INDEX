import java.util.Scanner;

public class beratIdeal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan tinggi badan (dalam cm): ");
        double tinggiCm = scanner.nextDouble();
        
        System.out.print("Masukkan berat badan (dalam kg): ");
        double berat = scanner.nextDouble();

        // Menghitung tinggi badan dalam meter
        double tinggiMeter = tinggiCm / 100;

        // Menghitung BMI
        double bmi = berat / (tinggiMeter * tinggiMeter);

        // Menampilkan hasil BMI
        System.out.printf("BMI Anda: %.2f%n", bmi);

        // Menentukan kategori BMI
        if (bmi < 18.5) {
            System.out.println("Anda berada dalam kategori kurus.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Anda berada dalam kategori berat badan ideal.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Anda berada dalam kategori kelebihan berat badan.");
        } else {
            System.out.println("Anda berada dalam kategori obesitas.");
        }

        scanner.close();
    }
}
