import java.util.Locale;
import java.util.Scanner;

public class Basico_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*int minutos = sc.nextInt();
		double conta = 50.0;
		
		System.out.println("Dige a quantidade de minutos:"+minutos);
		
		if (minutos>100) {
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.println("O valor da conta será: "+conta);
		
		sc.close();
		
		
		int valor= sc.nextInt();
		String mensagem = "Informe o dia da semana: ";
		String dia;
		
		System.out.println(mensagem+valor);
		
		switch (valor) {
			case 1:
				dia = "segunda-feira";
				break;
			case 2: 
				dia = "terça-feira";
				break;
			case 3:
				dia = "quarta-feira";
				break;
			case 4:
				dia = "quinta-feira";
				break;
			case 5:
				dia = "sexta-feira";
				break;
			case 6:
				dia = "sábado";
				break;
			case 7:
				dia = "domingo";
				break;
			default:
				dia = "ERRO!!!";
				break;
		}
		
		System.out.println("Hoje é ["+dia+"]");
		
		/*
		double preco = sc.nextDouble();
		double desconto;
		
		System.out.println("INFORME O VALOR: "+preco);
		
		if (preco < 20) {
			desconto = preco * 0.1;
		}else {
			desconto = preco * 0.05;
		}
		//OU		
		//desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		double pagamento = preco - desconto;
		
		System.out.println("valor a ser pago: R$"+pagamento);
		
		System.out.println("valor do desconto: R$"+desconto);
	*/
	}

}
