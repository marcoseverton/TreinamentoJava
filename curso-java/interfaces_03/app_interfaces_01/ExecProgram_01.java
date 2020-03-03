package app_interfaces_01;

import java.util.List;

import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ExecProgram_01 {

	public static void main(String[] args) {
		
		List <Funcionario> list = new ArrayList<>();
		String path = "/home/mealmeida/Documentos/in.text";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String funcionarioCsv = br.readLine();
			
			while (funcionarioCsv != null) {
				String[] vetor = funcionarioCsv.split(",");
				list.add(new Funcionario(vetor[0], Double.parseDouble(vetor[1])));
				funcionarioCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Funcionario f : list) {
				System.out.println(f.getName() + ", " + f.getSalary());
			}
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		

	}

}
