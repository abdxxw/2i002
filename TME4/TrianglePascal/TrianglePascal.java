public class TrianglePascal{
	private int[][] tab;
	
	public TrianglePascal(int n){
		tab = new int[n][];
		for(int i=0;i<tab.length;i++){
			tab[i] = new int[i+1];
		}
	}

	public void remplirTriangle(){
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				if((j==0)||(j==i))
					tab[i][j] = 1;
				else
					tab[i][j]=tab[i-1][j-1]+tab[i-1][j];
			}

		}
	}
	public String toString(){
		String temp="";
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				temp+=tab[i][j]+" ";
			}
				temp+="\n";
		}
	return temp;
	}
}
