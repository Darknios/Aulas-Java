package Strings;
import java.util.StringTokenizer;
import java.util.Scanner;
public class exemplo4 {
	public static void main(String [] args) {
		Scanner texto = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		StringTokenizer exemplo = new StringTokenizer(texto.nextLine());
		System.out.println(exemplo.countTokens());
	}
}
