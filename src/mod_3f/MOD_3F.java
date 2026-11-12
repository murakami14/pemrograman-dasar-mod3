import java.util.Locale;
import java.util.Scanner;

public class MOD_3F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Karyawan : ");
        int jumlah = Integer.parseInt(input.nextLine());

        String[][] karyawan = new String[jumlah][4];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));
            System.out.print("Nama      : ");
            karyawan[i][0] = input.nextLine().toUpperCase();
            System.out.print("Jabatan   : ");
            karyawan[i][1] = input.nextLine().toUpperCase();
            System.out.print("Gapok     : ");
            karyawan[i][2] = input.nextLine();
            System.out.print("Tunjangan : ");
            karyawan[i][3] = input.nextLine();
        }

        Locale id = Locale.forLanguageTag("id-ID");
        System.out.println();
        System.out.printf("%-5s%-12s%-12s%-15s%s%n", "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");
        for (int i = 0; i < jumlah; i++) {
            long gapok = Long.parseLong(karyawan[i][2]);
            long tunj = Long.parseLong(karyawan[i][3]);
            System.out.printf("%-5d%-12s%-12s%-15s%s%n", i + 1, karyawan[i][0], karyawan[i][1],
                    String.format(id, "%,d", gapok), String.format(id, "%,d", tunj));
        }
        input.close();
    }
}