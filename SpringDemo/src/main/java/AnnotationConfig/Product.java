package AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private String name;
	public Product() {
		super();
	}
	private String type;
	private Integer price;
	
	public Product(String name, String type, Integer price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
