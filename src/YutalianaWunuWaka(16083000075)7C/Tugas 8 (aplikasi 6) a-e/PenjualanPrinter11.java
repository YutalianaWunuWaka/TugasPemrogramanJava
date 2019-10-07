
package penjualanprinter1.pkg1;
import java.util.Scanner;
public class PenjualanPrinter11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukan Harga Printer= ");
            int hargaprinter = input.nextInt();
            System.out.println("Masukan Jumlah Beli = ");
                int jumlahbeli = input.nextInt();
                int totalharga = (hargaprinter*jumlahbeli);
            System.out.println(hargaprinter+ "x" +jumlahbeli+" = "+ totalharga);
            
    }
    
}
