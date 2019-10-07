package totalupahkerja2;

import java.util.Scanner;

public class TotalUpahKerja2 {

    public static void main(String[] args) {
        String nama = "";
        Scanner sc = new Scanner(System.in);
        int jamkerja, upahperjam, jumlah, pajak;
        System.out.println("Masukan Nama = ");
        nama = sc.nextLine();
        System.out.println("Masukan Jumlah Jam Kerja = ");
        jamkerja = sc.nextInt();
        System.out.println("Upah Per Jam = Rp2500,-");
        upahperjam = 25000;
        jumlah = upahperjam * jamkerja;
        System.out.println("Total Upah = Rp" + jumlah);

        if (jamkerja >= 0) {
            pajak = jumlah*15/100;
            jumlah = jumlah + pajak;
            System.out.println("Pajak = 15%\n" + "Rp"+jumlah);
        }

    }

}
