package qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarkerItem")
public class MarkerItem implements Item{

	public MarkerItem(){
		
	}
	public String getName() {
		return "Marker";
	}

}
