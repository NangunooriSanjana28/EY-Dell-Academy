package class8;

import java.util.Optional;

public class UseofOptionalClass {

	public static void main(String[] args) {
		
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		
		if(checkNull.isPresent()) {
			String word = words[6].toLowerCase();
			System.out.println(word);
		}else {
			System.out.println("word is null");
		}

	}

}
