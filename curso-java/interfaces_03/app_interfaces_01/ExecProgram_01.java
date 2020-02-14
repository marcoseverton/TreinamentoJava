package app_interfaces_01;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ExecProgram_01 {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		String path = "/home/mealmeida/Documentos/in.text";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String name = br.readLine();
			
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list);
			
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		

	}

}
