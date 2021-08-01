package Factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inventory {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("Factory.xml");
	ProductFactory productFactory=(ProductFactory) context.getBean("productFact");
	System.out.println(productFactory);
	ProductFactory productInstanceFactory=(ProductFactory) context.getBean("productInstanceFact");
	System.out.println(productInstanceFactory);
}
}
