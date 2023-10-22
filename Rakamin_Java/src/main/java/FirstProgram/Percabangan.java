package FirstProgram;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        
        String password = prompt("Enter Password : ");
        String validPassword = "password";

        // Jika benar, maka "Selamat datang, bosque
        // Jika salah (else), maka error message
        if (password.equals(validPassword)){
            System.out.println("Selamat datang, Bosque..");
        } else {
            System.out.println("Password salah, Om.. Coba lagi");
        }
        System.out.println("Terima kasih sudah menggunakan aplikasi ini.");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
