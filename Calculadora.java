package math;

public class Calculadora {
 
	public static void main(String[]args) {
		
		Operacoes op1 = new Operacoes();
		Operacoes op2 = new Operacoes(2,3);
		Operacoes op3 = new Operacoes(5,6,7);
	    op2.somar(op2.a,op2.b);
	}
}

   