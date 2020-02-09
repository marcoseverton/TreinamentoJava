package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("ANA");
		list.add("ALEX");
		list.add("BOB");
		list.add("EBRO");
		list.add(1,"EDIE");
		
		System.out.println("n° de membros:"+list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("Index of BOB: "+list.indexOf("BOB"));
		System.out.println("Index of ALEX" +list.indexOf("JOAO"));
		
		System.out.println("---------------------------");
		list.remove("BOB");
		//list.remove(0);
		
		//list.removeIf(X -> X.charAt(0) == 'A');
				
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("n° de membros restantes: "+list.size());
		
		System.out.println("---------------------------");
		List <String> result = list.stream().filter(X -> X.charAt(0) =='A').collect(Collectors.toList());
		System.out.println("---------------------------");
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		String name = list.stream().filter(X -> X.charAt(0) =='A').findFirst().orElse(null);
		sc.close();
		
		for (String x : result) {
			System.out.println(x);
		}
		
		sc.close();
	}
	

}
