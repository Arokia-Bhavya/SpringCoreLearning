package aop;

public interface OpenDoor {

	public int openDoorWithKey(int num);
	
	public int openDoorWithPassword();
	
	public void throwErr() throws Exception;
	
	public int openDoorWithReturn();
}
