public class StringReversible implements Reversible{
    private String s;
    public StringReversible(String s){
        this.s =s;
    }
    public void inverser(){
        String temp="";
        for(int i =s.length()-1;i>=0;i++){
            temp += s.charAt(i);
        }
        s=temp;

    }
}