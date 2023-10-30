import java.util.Scanner;

class Trapesium1 {
    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    public Trapesium1(double alasAtas, double alasBawah, double tinggi) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return (alasAtas + alasBawah) * tinggi / 2;
    }
}

public class trapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas atas: ");
        double alasAtas = input.nextDouble();

        System.out.print("Masukkan panjang alas bawah: ");
        double alasBawah = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        Trapesium1 trapesium = new Trapesium1(alasAtas, alasBawah, tinggi);
        double luas = trapesium.hitungLuas();

        System.out.println("Luas trapesium: " + luas);
    }
}
