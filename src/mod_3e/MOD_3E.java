import java.util.Scanner;

public class MOD_3E{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bTugas = 0.3, bUts = 0.3, bUas = 0.4;

        System.out.println("DATA NILAI MAHASISWA\nSISTEM INFORMASI\nFKOM - UNIKU");
        System.out.print("Jumlah Orang : ");
        int jumlah = Integer.parseInt(input.nextLine());

        String[][] mahasiswa = new String[jumlah][6];
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("NAMA  : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("TUGAS : ");
            mahasiswa[i][2] = input.nextLine();
            System.out.print("UTS   : ");
            mahasiswa[i][3] = input.nextLine();
            System.out.print("UAS   : ");
            mahasiswa[i][4] = input.nextLine();

            double tugas = Double.parseDouble(mahasiswa[i][2]);
            double uts = Double.parseDouble(mahasiswa[i][3]);
            double uas = Double.parseDouble(mahasiswa[i][4]);

            double na = bTugas * tugas + bUts * uts + bUas * uas;
            mahasiswa[i][5] = String.valueOf(na);
            total += na;
        }

        System.out.println();
        System.out.printf("%-5s%-14s%-12s%-8s%-8s%-8s%s%n",
                "No.", "NIM", "NAMA", "TUGAS", "UTS", "UAS", "NILAI AKHIR");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d%-14s%-12s%-8s%-8s%-8s%s%n",
                    i + 1, mahasiswa[i][0], mahasiswa[i][1], mahasiswa[i][2],
                    mahasiswa[i][3], mahasiswa[i][4], mahasiswa[i][5]);
        }

        System.out.println("\nRata-rata Nilai Akhir : " + (total / jumlah));
        input.close();
    }
}