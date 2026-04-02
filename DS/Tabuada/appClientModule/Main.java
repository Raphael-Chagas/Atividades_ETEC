import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um número:");
	int numero = scanner.nextInt(); 
	for(int x = 1; x < 11; x++) {
		for(int i = 1; i <11; i++ ) {
			int mult = (numero*i);
		numero = numero + 1; 
		System.out,println (numero + "x" + i + "=" + mult);
		}
			 
	}
	scanner.close();
	
}
}
