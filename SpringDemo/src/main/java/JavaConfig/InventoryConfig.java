package JavaConfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import XmlConfig.Product;

@Configuration
public class InventoryConfig {

	@Bean
	public Inventory inventory()
	{
		List<Product> productList=new ArrayList<Product>();
		productList.add(product1());
		productList.add(product2());
		productList.add(product3());
		productList.add(product4());
		return new Inventory(productList);
	}
	
	@Bean
	public Product product1() {
	      return new Product("rice","groceries",100);
	}
	
	@Bean
	public Product product2() {
	      return new Product("pencil","Stationery",10);
	}
	
	@Bean
	public Product product3() {
	      return new Product("Tomato","vegetable",20);
	}
	
	@Bean
	public Product product4() {
	      return new Product("Apple","Fruit",30);
	}
}
