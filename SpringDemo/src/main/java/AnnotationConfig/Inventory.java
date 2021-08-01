package AnnotationConfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import JavaConfig.InventoryConfig;

@Component
public class Inventory {
	public Inventory() {
		super();
	}

	@Autowired
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
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(RootConfig.class);
		Product product=(Product) context.getBean("product");
		product.setName("rice");
		product.setType("groceries");
		product.setPrice(100);		
		Inventory inventory=(Inventory) context.getBean("inventory",Inventory.class);		
		System.out.println(inventory);
		
	}

}
