package math;

public class Animal {
	String n;
	int i;
public Animal (String nome, int idade) {
	this.n = nome;
	this.i = idade;
}

public void emitirsom () {
	 System.out.println("O Animal está emitindo som!"+n);
	 

}
public void locomover () {
	 System.out.println("O Animal está se locomovendo!"+n);
}
}

