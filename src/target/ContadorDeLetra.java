package target;

import java.util.Scanner;

public class ContadorDeLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();
        scanner.close();

        int c = 0;
        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);
            if (a == 'a' || a == 'A') {
                c++;
            }
        }

        System.out.println("A letra 'a' ocorre " + c + " vez(es) na string.");
    }
}