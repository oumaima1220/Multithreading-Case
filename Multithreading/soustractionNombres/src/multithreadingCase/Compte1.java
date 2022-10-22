package multithreadingCase;

public class Compte1 {
  private int solde = 4000;
	
	public int getSolde()
	{
		return solde ;
	}
	
	public void retirer(int montant)
	{
		this.solde -= montant ; 

		System.out.println("########## solde = " + this.solde);
	}

}
