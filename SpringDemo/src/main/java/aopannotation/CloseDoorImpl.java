package aopannotation;

import org.springframework.stereotype.Component;

@Component
public class CloseDoorImpl implements CloseDoor{

	public int closeDoorWithKey(int key) {
		System.out.println("Closing the Door ....");
		return 1;
	}

	public boolean closeDoorWithPassword() {
		System.out.println("Closing the Door with Password....");		
		return true;
	}
}
