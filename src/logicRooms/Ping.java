package logicRooms;

public class Ping {
	Ping next;
	boolean status;
	
	public Ping() {
		status = false;
	}
	
	
	public void setNext(Ping n) {
		next = n;
	}
	public void recieve(boolean b) {
		status = b;
		Action();
	}
	
	public boolean send() {
		System.out.println(status);
		if(next!=null) {
			next.recieve(status);
			
		}
		return status;
	}
	
	
	public void Action() {
		send();
	}
}
