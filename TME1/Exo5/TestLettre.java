public class TestLettre{
	public static void main(String[] args){
	int i =0;
	for(char x='a';x<='z';x++){
		Lettre L = new Lettre(x);
		System.out.println(L.getCodeAscii());
	}

	for(char x='a';x<='z';x++){
		Lettre L = new Lettre(x);
		System.out.print(L.getCarac()+" ");
	
	i++;
	if (i == 5){
		System.out.println("");
		i=0;
	}
	}
	}
}
