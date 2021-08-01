package JavaConfig;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import XmlConfig.Product;

public class Inventory {
	public Inventory() {
		super();
	}
	
	private List<Product> products;

	@Override
	public String toString() {
		return "Inventory [products=" + products + "]";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	public Inventory(List<Product> products) {
		super();
		this.products = products;
	}

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(InventoryConfig.class);
	
		Inventory inventory=(Inventory) context.getBean(Inventory.class);
		System.out.println(inventory);
	}

}
