package XmlConfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		ApplicationContext context=new ClassPathXmlApplicationContext("Inventory.xml");
	
		Inventory inventory=(Inventory) context.getBean("Inventory");
		System.out.println(inventory);
	}

}
