package Class6;

class MyGeneralizedClass<T>{
      T obj;
      
      void add(T obj) {
    	  this.obj= obj;
      }
      
      T get() {
    	  return obj;
      }

}
class GeneralizedClass<E>{
	E obje;
	
	void sub(E obje) {
		this.obje = obje;
	}
	E get() {
		return obje;
	}
}

public class UseOfGenerics {

	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
		intType.add(21);
		intType.add(31);
		//intType.add("ABC");//compile time error will come if i try to add
		//any other data apart from integer
		
		System.out.println(intType.get());
		
		MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
		strType.add("ABC");
		//intType.add(31);//compile time error will come if i try to add
		//any other data apart from string
	
		System.out.println(strType.get());
		
		MyGeneralizedClass<Boolean> boolType = new MyGeneralizedClass<>();
		boolType.add(true);
		
		System.out.println(boolType.get());
		
		GeneralizedClass<Integer> inttType = new GeneralizedClass<>();
		inttType.sub(21);
		inttType.sub(31);
		System.out.println(inttType.get());

	}

}
