package fundamentos1;

public class stringsteste {
public static void main(String[] args) {
	String str = "O rato roeu a roupa do rei de roma";
	int resultado = str.length();
	System.out.println(resultado);
	String renome = str.replace(" ", " ");
	int tamanho = renome.length();
	System.out.println(tamanho);
}
}
