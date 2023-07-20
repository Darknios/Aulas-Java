package math;

public class Operacoes {
	
		int a;
		int b;
		int c;
	public Operacoes() {
		
		}
	public Operacoes(int valor1, int valor2) {
				this.a = valor1;
				this.b = valor2;
		}
	public Operacoes(int valor1, int valor2, int valor3) {
			this.a = valor1;
			this.b = valor2;
			this.c = valor3;
				
		}
	public void somar (int a, int b) {
		System.out.println("A somar dos dois valores é:"+ (a+b));
	}

 
 	public void somar(int a, int b, int c) {
 		System.out.println("A somar dos três valores é:"+(a+b+c));
 }


 	public void sub (int a, int b) {
 		System.out.print("A subtracão dos dois valores é:"+(a-b));
}


	public void sub(int a, int b, int c) {
		System.out.println("A subtração dos três valores é:"+(a-b-c));
}


	public void mult (int a, int b) {
		System.out.print("A multiplicação dos dois valores é:"+(a*b));
}


	public void mult(int a, int b, int c) {
		System.out.println("A multiplicação dos três valores é:"+(a*b*c));
}


	public void div (int a, int b) {
		System.out.print("A divisão dos dois valores é:"+(a/b));
}


	public void div(int a, int b, int c) {
		System.out.println("A divisão dos três valores é:"+(a/b/c));
}
}
