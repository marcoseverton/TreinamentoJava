import java.util.Scanner;

public class Basico_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int valor= input.nextInt();
		int soma = 0;
		
		while (valor != 0) {
			soma += valor;
			valor = input.nextInt();
		}*/
		
		for (int x = 0; x <=10; x ++) {
			System.out.println("numeros digitados: \n"+ x);
		}
		
		input.close();
		
	}

}
