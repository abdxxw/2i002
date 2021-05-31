
public class Case {
	private int nbBilles;
	private Joueur prop;
	
	
	public int getNbBilles() {
		return nbBilles;
	}

	public void setNbBilles(int nbBilles) {
		this.nbBilles = nbBilles;
	}

	public Joueur getProp() {
		return prop;
	}

	public void setProp(Joueur prop) {
		this.prop = prop;
	}

	public Case(Joueur prop) {
		
		this.prop = prop;
		nbBilles = 4;
	}
	
	public Case() {
		
		this(new Joueur());
	}

	public String toString() {
		return "Case [nbBilles=" + nbBilles + prop.getNumero()+"]";
	}
	
	
}
