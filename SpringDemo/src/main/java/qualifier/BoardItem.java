package qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BoardItem")
public class BoardItem implements Item{

	public BoardItem(){
		
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "Board";
	}

}
