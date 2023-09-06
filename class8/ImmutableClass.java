package class8;

public class ImmutableClass {

	public static void main(String[] args) {
		
		String str = new String("ABC");
		System.out.println("After First Step"+str);
		str=str.concat(" -- XYZ" );
		System.out.println("After Second Step-"+str);
		
		StringBuilder sb = new StringBuilder();
		System.out.println("SB-After first step " +str);
		sb.append("XYZ");
		System.out.println("SB-After second step " +sb.toString());

	}

}
