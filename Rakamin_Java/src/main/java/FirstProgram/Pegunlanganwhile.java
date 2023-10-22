package FirstProgram;

import java.util.Scanner;

public class Pegunlanganwhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready? (yes/no)");
        String ulangi = scanner.nextLine();
        System.out.println("Start");
        int counter = 0;

        while (ulangi.equals("1") || ulangi.equalsIgnoreCase("yes")) {
            System.out.print("Try again? (yes/no) : ");
            String jawab = scanner.nextLine();
            counter++;

            if (!jawab.equalsIgnoreCase("yes")) {
                ulangi = "0";
            }

            System.out.println("Retry no. " + counter + " success");
        };
    }
}
