package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SchoolService {

   @Autowired
   @Qualifier("MarkerItem")
   private Item item;

   public void printItem()
   {
	   System.out.println(item.getName());
   }
}