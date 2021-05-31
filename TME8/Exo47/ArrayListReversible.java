
import java.util.ArrayList;

public class ArrayListReversible<Object> extends ArrayList<Object> implements Reversible{
    private boolean inverse;

    public ArrayListReversible(boolean b){
        super();
        inverse=b;
    }
    public void inverser(){
        for(int i=0;i<this.size()/2;i++){
            inverse = false;
            Object temp = get(i);
            if(temp instanceof StringReversible)
                ((StringReversible) temp).inverser();
            inverse = true;
            this.set(i,this.get(i));
            this.set(this.size()-i-1,temp);
        }
    }
    public Object get(int index){
        if(inverse)
            return super.get(this.size()-index-1);
        else
            return super.get(index);

    }
    public String toString(){
         String temp="";
        for( Object o : this)
            temp +=o.toString()+"\n";

        return temp;
    }
}