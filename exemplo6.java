package Strings;

import java.util.Scanner;

public class exemplo6 {
 public static void main(String [] args) {
	 Scanner texto = new Scanner(System.in);
	 System.out.println("Digite um texto em minusculo");
	 String textos = texto.nextLine();
	 System.out.println(textos.toUpperCase());
 }
}
