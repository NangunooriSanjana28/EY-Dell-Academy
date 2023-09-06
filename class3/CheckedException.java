package class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read the character data
		BufferedReader br= null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		String str;
		try {
		do {
			System.out.println("Please enter sth,i will read it for you");
			str = br.readLine();
			System.out.println("What you have entered is "+str);
		}
		while(!str.equalsIgnoreCase("exit"));
			
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(br!=null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

					
		}
	
	}

}
