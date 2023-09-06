package class11;

/*
 * import java.util.ArrayList; import java.util.List;
 * 
 * class product{ private int ID; private int price; private int quantity;
 * product(int ID,int price,int quantity){ this.ID = ID; this.price = price;
 * this.quantity= quantity; } public int getID() { return ID; } public void
 * setID(int iD) { ID = iD; } public int getPrice() { return price; } public
 * void setPrice(int price) { this.price = price; } public int getQuantity() {
 * return quantity; } public void setQuantity(int quantity) { this.quantity =
 * quantity; } } interface productDAO{
 * 
 * public List<product> getAllproduct(); public product getproduct(int ID);
 * 
 * public void updateproduct (product product); public void deleteproduct
 * (product product);
 * 
 * 
 * }
 * 
 * class productDAOImp1 implements productDAO{
 * 
 * List<product> product; public productDAOImp1() {
 * 
 * product =new ArrayList<>(); product pro1=new product(123,1,2); product
 * pro2=new product(12,3,7); product.add(pro1); product.add(pro2); }
 * 
 * @Override public List<product> getAllproduct() {
 * 
 * return product; }
 * 
 * @Override public product getproduct(int ID) {
 * 
 * return product.get(ID); } } public class DAODesign_Pattern1 { productDAO
 * productDao=new productDAOImp1();{
 * 
 * for(product pr: productDao.getAllproduct()) {
 * 
 * System.out.println("product [price id "+ pr.getPrice()
 * +" , quantity: "+pr.getQuantity()+" ]");
 * 
 * }
 * 
 * product firstcustomer = productDao.getAllproduct().get(0);
 * 
 * System.out.println("First customer is "+ firstcustomer.getPrice()+ " "+
 * firstcustomer.getQuantity());
 * 
 * firstcustomer.setPrice(789);
 * 
 * for(product pr1: productDao.getAllproduct()) {
 * 
 * System.out.println("Student [ Stu id "+pr1.getPrice()+" , Name: "+
 * pr1.getQuantity());
 * 
 * }
 * 
 * }}
 */