
package totalupahkerja;
import java.util.Scanner;
public class TotalUpahKerja {
    public static void main(String[] args) {
        String nama = "";
    Scanner sc = new Scanner(System.in);
        int jamkerja, upahperjam, jumlah;
        System.out.println("Masukan Nama = ");
        nama = sc.nextLine();
        System.out.println("Masukan Jumlah Jam Kerja = ");
        jamkerja=sc.nextInt();
        System.out.println("Upah Per Jam = Rp2500,-");
        upahperjam=25000;
        jumlah = upahperjam*jamkerja;
        System.out.println("Total Upah = Rp"+jumlah);
        
        
    }
    
}
