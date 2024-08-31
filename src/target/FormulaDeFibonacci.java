package target;

import java.util.Scanner;

public class FormulaDeFibonacci {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        int a = 0, b = 1, c = 0;

	        while (c < n) {
	            c = a + b;
	            a = b;
	            b = c;
	        }

	        if (c == n || n == 0) {
	            System.out.println(n + " faz parte da sequência de Fibonacci.");
	        } else {
	            System.out.println(n + " não faz parte  sequência de Fibonacci.");
	        }
	    }
	}

