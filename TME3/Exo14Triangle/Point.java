public class Point{
	private int posx,posy;
	
	public Point(){
		posx=0;
		posy=0;
	}
	public Point(int x,int y){
		posx=x;
		posy=y;
	}

	public int getPosx(){
		return posx;
	}
	public int getPosy(){
		return posy;
	}
	public void setPosx(int x){
		posx=x;
	}
	public void setPosy(int y){
		posy=y;
	}

	public String toString(){
		return "("+posx+", "+posy+")";
	}

	public double distance(Point p){
		return Math.sqrt(Math.pow(p.posx-this.posx,2) + Math.pow(p.posy-this.posy,2));
	}

	public void deplaceToi(int newx, int newy){
		posx = newx;
		posy = newy;
	}
	
	public boolean equals(Point p){
		return ((p.posx == posx) && (p.posy == posy));
	}

	

}
