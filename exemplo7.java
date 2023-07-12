package Strings;

public class exemplo7 {
	public static void main(String [] args) {
		String texto []= {"a", "vida","é" ,"bela"};
		String palavras = texto[0] + " " + texto[1] +" "+ texto[2] +" "+ texto[3];
		System.out.println(palavras.toUpperCase());
		String palavra = texto[3]+ " " + texto[2] +" "+ texto[1] +" "+ texto[0];
		System.out.println(palavra.toUpperCase());
		
}
}