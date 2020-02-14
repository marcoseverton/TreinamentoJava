package app_interface_01;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class ExecProgram_01 {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("MyLetter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner cs = new ConcreteScanner("2003");
		cs.processDoc("My Email");
		System.out.println("Scan result: " + cs.scan());
		
		System.out.println();
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: " + cd.scan());
	}

}
