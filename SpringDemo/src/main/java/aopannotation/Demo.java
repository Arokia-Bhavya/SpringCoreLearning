package aopannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aopannotation")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Demo {
	
	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(Demo.class);			
			OpenDoor openDoor = (OpenDoor)appContext.getBean("openDoorImpl");
			System.out.println(openDoor.getClass().getName());
			openDoor.openDoorWithKey(100);
			CloseDoor closeDoor = (CloseDoor)appContext.getBean("closeDoorImpl");
			System.out.println(closeDoor.getClass().getName());
			closeDoor.closeDoorWithPassword();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
