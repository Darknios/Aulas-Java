package repeticao;
import java.util.Scanner;
public class While4 {
public static void main(String [] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int numeros = numero.nextInt();
	int cont = 0;
	while (cont<numeros) {
		cont = cont+1;
		if (cont % 2 ==0) {
			System.out.println("Número Par: "+cont);
		}
		System.out.println(" ");
		if (cont % 2 !=0) {
			System.out.println("Número Impar: "+cont);
	}
}
}
}