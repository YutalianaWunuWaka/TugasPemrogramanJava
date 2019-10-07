
package pembelianprinter2;
import java.util.Scanner;
public class Pembelianprinter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga, jumlah, total, diskon;

        System.out.println("Masukan Harga Barang = ");
        harga = sc.nextInt();
        System.out.println("Masukan Jumlah Barang = ");
        jumlah = sc.nextInt();
        total = jumlah * harga;
        System.out.println("Total Harga = Rp" + total);
        if (total >= 1500000) {
            diskon = total * 15 / 100;
            total = total - diskon;
            System.out.println("Diskon=15%\n" + "Rp"+total);

        } else if (total <= 660000) {
            diskon = 0;
            System.out.println("Diskon = Rp" + diskon);
        }
        System.out.println("Total Yang Harus Dibayar = Rp" + total);
    }
}
