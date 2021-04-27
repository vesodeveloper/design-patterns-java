package chatroom;

public class FOSSUser extends User{

	public FOSSUser(FOSSMediator fossMediator,String name) {
		super(fossMediator, name);
	fossMediator.addFOSSUser(this);	
	}

	@Override
	public void sMessage(String message) {
	
		System.out.println(this.name +"sends"+message);
		fossMediator.sndMsg(message, this);
		
	}

	@Override
	public void rMessage(String message) {
System.out.println(this.name +"recieves"+message);		
	}

}
