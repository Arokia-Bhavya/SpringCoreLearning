package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import XmlConfig.Product;
import factory.InventoryConfig;

public class Inventory {
public static void main(String[] args)
{
	ApplicationContext context=new ClassPathXmlApplicationContext("Factory.xml");
	Product product1=(Product) context.getBean("bean1");
	System.out.println(product1);
	Product product2=(Product) context.getBean("bean2");
	System.out.println(product2);
	
		/*ApplicationContext ctx=new AnnotationConfigApplicationContext(InventoryConfig.class);
	
		Product bean1 = (Product) ctx.getBean("bean1");
		Product bean2 = (Product) ctx.getBean("bean2");
		
		System.out.println(bean1);
		System.out.println(bean2);*/
}
}
