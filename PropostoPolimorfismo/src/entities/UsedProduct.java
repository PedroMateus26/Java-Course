package entities;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UsedProduct extends Product{
	private Date manufacturedProduct;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		
	}
	
	

	public UsedProduct(String name, Double price, Date manufacturedProduct) {
		super(name, price);
		this.manufacturedProduct = manufacturedProduct;
	}



	public Date getManufacturedProduct() {
		return manufacturedProduct;
	}

	public void setManufacturedProduct(Date manufacturedProduct) {
		this.manufacturedProduct = manufacturedProduct;
	}
	
	
	@Override
	public String priceTag() {
		return super.priceTag()
				+" (Manufactured Date: "
				+sdf.format(manufacturedProduct)
				+")";
	}
	
}
