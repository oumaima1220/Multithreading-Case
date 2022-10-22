package soustractionNombres;

public class Test {

	public static void main(String[] args) {
		Runnable utilisateurs = new Soustraction();
		
		Thread sara = new Thread(utilisateurs);
		
		Thread ali = new Thread(utilisateurs);
		
		sara.setName("sara");
		ali.setName("ali");
						
		ali.start();
		sara.start();
	}

}
