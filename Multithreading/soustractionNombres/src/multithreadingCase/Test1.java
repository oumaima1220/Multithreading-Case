package multithreadingCase;

import multithreadingCase.Soustraction1;

public class Test1 {

	public static void main(String[] args) {
		Runnable utilisateurs = new Soustraction1();
		
		Thread sara = new Thread(utilisateurs);
		
		Thread ali = new Thread(utilisateurs);
		
		sara.setName("sara");
		ali.setName("ali");
		
		ali.start();
		sara.start();
		
		
	}

}