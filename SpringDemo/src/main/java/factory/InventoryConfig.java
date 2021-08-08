package factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import XmlConfig.Product;

@Configuration
public class InventoryConfig {
	
	@Bean(name = "bean1")
	public Product createBeanFromStaticMethodFactory() {
		return ProductFactory.createProduct("rice","grains",100);
	}

	@Bean(name = "bean2")
	public Product createBeanFromNonStaticMethodFactory() {
		ProductFactory beanFactory = new ProductFactory();
		return beanFactory.createInstanceProduct("wheat","grains",200);
	}
}
