package entities;

public class Products {

	private String name;
	private Integer quantity;
	private Double value;
	
	public Products(String product, Integer quantity, Double value) {
		this.name = product;
		this.quantity = quantity;
		this.value = value;
	}

	public String getProduct() {
		return name;
	}

	public void setProduct(String product) {
		this.name = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getValue() {
		return value;
	}

	public double totalValue() {
		return quantity*value;
	}
	
	@Override
	public String toString() {
		return name+", "+totalValue();
	}
	
}	
