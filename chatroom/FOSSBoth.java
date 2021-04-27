package chatroom;

public class FOSSBoth extends FOSSChat{
private static FOSSBoth both;
	public FOSSBoth() {
		
	}
	private static FOSSBoth getBoth() {
		if(both==null) {
both=new FOSSBoth();}
		return both;

	}
	public void track(User user,String message) {
	if(message=="cat") {
this.removeFOSSUser(user);		
		System.out.println("Word cat is forbidden ");
	}
	
	}

}
