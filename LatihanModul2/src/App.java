import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println ("Masukkan NIM: ");
        String NIM = input.nextLine();

        System.out.println ("Masukkan Usia: ");
        int usia = input.nextInt ();

        System.out.println("Masukan Tinggi Badan: ");
        double tB = input.nextDouble();

        System.out.println("NIM = " + NIM + " usia = " + usia + " Tingi Badan = " + tB);

        int hasilAritmatika = ((usia*2) +(10/ 5) - 3);
        System.out.println("Hasil Operasi = " + hasilAritmatika);

        boolean diAtas18 = usia > 18;
        System.out.println("Usia Lebih Dari 18 tahun : " + diAtas18);

        boolean kondisi = (usia > 18) && (tB > 160);
        System.out.println("Usia > 18 tahun dan tinggi badan > 160 cm : " + kondisi);

        Double usiaDouble = (double)usia;
        int tBInt = (int)tB;
        System.out.println("Usia Dalam tipe Double = " + usiaDouble);
        System.out.println("Tinggi badan dalam tipe Int = " + tBInt);

        input.close();
        
    }
}
