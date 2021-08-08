package qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
 
		
		context.scan("qualifier");
		context.refresh();
		SchoolService itemTypes = context.getBean(SchoolService.class);
		itemTypes.printItem();
		
		

	}

}
