package Factory;


public class ProductFactory {
	public ProductFactory() {
		super();
	}

	private String name;	
	
	public ProductFactory(String name) {
		super();
		this.name = name;
	}
	
	public static ProductFactory getProduct(String name)
	{
		return new ProductFactory(name);
	}
	
	public ProductFactory getInstanceProduct(String name)
	{
		return new ProductFactory(name);
	}
}
