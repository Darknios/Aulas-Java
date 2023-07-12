package JavaPOO;

public class UsoClasseAtributos {
	public static void main(String [] args) {
		AtributosClasses clientes01 = new AtributosClasses();
		System.out.println(clientes01.fnome);
		System.out.println(clientes01.Inome);
		System.out.println(clientes01.idade);
		System.out.printf("O aluno %s %s tem %d anos", clientes01.fnome, clientes01.Inome,clientes01.idade);
	}
}
