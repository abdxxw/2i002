class Complexe{
	double reelle,imag;
	
	public Complexe(double reelle, double imag){
		this.reelle=reelle;
		this.imag=imag;
	}
	public Complexe(){
		this(Math.random()*6-2,Math.random()*6-2);
	}
	public String toString(){
		return "("+reelle+" + "+imag+" i)";
	}
	public Complexe addition(Complexe x){
		return new Complexe(reelle+x.reelle,imag+x.imag);
	}
	public Complexe multiplication(Complexe x){
		return new Complexe(reelle*x.reelle+imag*x.imag,reelle*x.imag+imag*x.reelle);
	}
	public boolean estReel(){
		return (this.imag == 0);
	}
}
