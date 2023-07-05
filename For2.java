package repeticao;

public class For2 {
	public static void main(String [] args) {
		for(int i = 0;i<100;i=i+1) {
			if(i > 50 && i<60) {
				continue;
			}
			
			
			System.out.println(i);
	}
}
}