package factory;

import XmlConfig.Product;

public class ProductFactory {
	
	public static Product createProduct(String name,String productType,Integer price)
	{
		return new Product(name,productType,price);
	}
	
	public Product createInstanceProduct(String name,String productType,Integer price)
	{
		return new Product(name,productType,price);
	}
}
