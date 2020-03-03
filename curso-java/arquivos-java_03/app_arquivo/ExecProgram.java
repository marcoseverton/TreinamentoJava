package app_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExecProgram {

	public static void main(String[] args) {
		
		String[] lines = new String [] {
			"Good morning", "Good afternoon", "Good night"
		};
		
		String path = "/home/mealmeida/Documentos/arq-inserido-java.txt";
		// SE NÃO EXISTIR O ARQUIVO O PROGRAMA CRIA O ARQUIVO, MAS SE EXISTIR O PROGRAMA ATUALIZA OS DADOS DO ARQUIVO COM BASE NO VETOR 'line'
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("O arquivo foi gerado e escrito com os parametros do VETOR 'lines'");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
