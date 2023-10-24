package containment;

public class Product 
{
	private String productName;
	private double price;
	private MyDate manufacturingDate;
	
	public Product()
	{
		this("Pen", 10.5, new MyDate());
	}
	
	public Product(String productName, double price, MyDate manufacturingDate)
	{
		this.productName=productName;
		this.price=price;
		this.manufacturingDate=manufacturingDate;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		return "Product Details:\nProduct Name="+productName+"\nPrice="+price+"\nManufacturing Date="+manufacturingDate+"\n";
	}
}
