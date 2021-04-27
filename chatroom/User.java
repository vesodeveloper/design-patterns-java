package chatroom;

public abstract class User {
protected String name;
protected FOSSMediator fossMediator;

	public User(FOSSMediator fossMediator,String name) {
	this.fossMediator=fossMediator;
	this.name=name;	
	}
	public abstract void sMessage(String message);
	public abstract void rMessage(String message);
	

}
