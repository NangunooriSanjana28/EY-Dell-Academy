package class11;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product{
	int product_id;
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}

	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;
	LocalDate prodValidity;
	
    public LocalDate getProdValidity() {
		return prodValidity;
	}

	public void setProdValidity(LocalDate prodValidity) {
		this.prodValidity = prodValidity;
	}

	Product(){}
	
	Product(int product_id,
	String prod_name,
	String prod_desc,
	int prod_quantity,
	double prod_price,LocalDate prodValidity ){
		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
	}
	
}
interface ProductDAO{
	String nameOfProduct(Product p);
	int priceOfProduct(Product p);
	int quantityOfProduct(Product p);
	String descriptionOfProduct(Product p);
	LocalDate prodValidatityDate(Product p);
	List<Product> getAllProducts();
	void deleteProduct(Product p);
}

class ProductDAOImp1 implements ProductDAO{
	
	List<Product> ListOfProducts = new ArrayList<>();
	
	public ProductDAOImp1() {
		Product p1 = new Product(123,"A","B",10,10.29,LocalDate.now());
		Product p2 = new Product(124,"C","D",20,20.29,LocalDate.of(2019,Month.FEBRUARY,20));
		
		ListOfProducts.add(p1);
		ListOfProducts.add(p2);
	}

	@Override
	public String nameOfProduct(Product p) {
		
		Iterator<Product> itr = ListOfProducts.iterator();
		while(itr.hasNext()) {
			Product p2 = itr.next();
			return p2.getProd_name();
		}
		return null;
	}

	@Override
	public int priceOfProduct(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantityOfProduct(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String descriptionOfProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate prodValidatityDate(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return ListOfProducts;
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		ListOfProducts.remove(p);
	}
	
	
	
}
public class ProductDAOClass {
	public static void main(String[] args) {
		ProductDAOImp1 obj = new ProductDAOImp1();
		for(Product p: obj.getAllProducts()) {
			System.out.println("Product Id "+p.product_id+"product name is " +p.prod_name);
			System.out.println("Name of the product "+p.getProd_name());
			System.out.println("Date of the product "+p.prodValidity);
			obj.deleteProduct(p);
			
		}
		afterDeleteProducts();
	}

 static void afterDeleteProducts() {
		ProductDAOImp1 obj = new ProductDAOImp1();
		if(null != obj.getAllProducts()) {
			for(Product p : obj.getAllProducts()) {
				System.out.println("Product Id" +p.product_id+"product name is"+p.prod_name);
				System.out.println("Name of Product is"+p.getProd_name());
			}
		}else {
			System.out.println("List is empty");
		}
		
	}

}
