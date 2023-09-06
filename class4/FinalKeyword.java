package class4;

public class FinalKeyword {
	final static String PAN_CARD_NUMBER;
	/*
	FinalKeyword() {
		PAN_CARD_NUMBER="AHYPC7878J";
		*/
	static {
		PAN_CARD_NUMBER ="AHYPC7878J";
	}
	final void display() {
		//PAN_CARD_NUMBER="AHYPC7878J";
		System.out.println("Final Method");
		
	}
	public static void main(String[] args) {
		FinalKeyword obj = new FinalKeyword();
		System.out.println("Obj is "+obj.PAN_CARD_NUMBER);
	}

}
