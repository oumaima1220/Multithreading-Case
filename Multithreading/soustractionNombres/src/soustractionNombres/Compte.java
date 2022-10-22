package soustractionNombres;

public class Compte {
  private int solde = 3000;
	
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
