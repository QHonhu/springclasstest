package springexp;

import java.io.PrintStream;

public class SalDragonQuest implements Quest {
	private PrintStream stream;
	
	public SalDragonQuest(PrintStream stream){
		this.stream=stream;
		
	}
	

	public void embark() {
		
		stream.println("������SalDragonQuest������������");

	}

}
