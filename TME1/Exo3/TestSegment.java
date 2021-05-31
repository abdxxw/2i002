public class TestSegment{
	public static void main(String[] args){
	Segment S1 = new Segment(6,8);
	Segment S2 = new Segment(12,5);

	if(S1.longeur() > S2.longeur())
		System.out.println("le "+S1.toString()+" est plus long que le "+S2.toString());
	else
		System.out.println("le "+S2.toString()+" est plus long que le "+S1.toString());
	}
}
