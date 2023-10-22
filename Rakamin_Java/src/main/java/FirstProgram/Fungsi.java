package FirstProgram;

import FirstProgram.Nama;
import Paket_B.NamaJuga;

public class Fungsi {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        int z = 40;

        Nama.Mamih("Joni");
        Nama.Mamih("Susan");
        Nama.Mamih("Charlie");

        NamaJuga.NamaDia("beda tempat");

        angka(x,y);
        angka(x,z);
        angka(y,z);
        kali(x,y);
        kali(x,z);
        kali(y,z);
        kuadrat(x);
        kuadrat(y);
        kuadrat(z);
    }

    public static int angka(int a, int b){
        int hasilTambah = a + b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah : "+hasilTambah);
        return hasilTambah;
    }

    public static int kali(int a, int b){
        int hasilKali = a * b;
        System.out.println("Hasil kali "+a+" dan "+b+" adalah : "+hasilKali);
        return hasilKali;
    }
    public static int kuadrat(int a){
        int hasilkuadrat = a * a;
        System.out.println("Hasil kuadrat "+a+ " adalah : "+hasilkuadrat);
        return hasilkuadrat;
    }
}
