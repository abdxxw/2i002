
public class Joueur {

	private int numero,gain;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getGain() {
		return gain;
	}

	public void setGain(int gain) {
		this.gain = gain;
	}

	public Joueur(int numero) {

		this.numero = numero;
		gain = 0;
	}
	public Joueur() {
		this(0);
		
	}

	@Override
	public String toString() {
		return "Joueur " + numero + ", [gain=" + gain + "]";
	}


	
	
	
}
