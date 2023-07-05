package repeticao;

public class For5 {
	public static void main(String [] args) {
	int soma3 = 0;
	int soma5 = 0;
	for (int i = 0; i<=20; i++) {
		if (i %3 == 0) {
			soma3 = soma3 + i;
		}if (i %5 == 0) {
			soma5 = soma5 +1;
		}
	}
	System.out.println("A soma do multiplicos de 3 de 0 até 20 e:"+soma3);
	System.out.println("A soma do multiplicos de 5 de 0 até 20 e:"+soma5);
	}
}
