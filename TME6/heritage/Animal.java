public abstract class Animal{
    protected int x,y;
    protected String type;

    public Animal(int x,int y,String type){
        this.x=x;
        this.y=y;
        this.type = type;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getType(){
        return type;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setType(String type){
        this.type = type;
    }

     public double distance(Animal a){
         return Math.sqrt(Math.pow(a.x-this.x,2)+Math.pow(a.y-this.y,2));
     }

     public void move(int i, int j) {
         x+=i;
         y+=j;
     }

     //public abstract void move(Animal a);

       public void afficher(){
        System.out.println("je suis un Animal");
    }
    
    //public abstract boolean equals (Object o)
    
}