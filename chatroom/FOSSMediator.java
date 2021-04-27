package chatroom;

public interface FOSSMediator {
	void addFOSSUser(User user);
	void removeFOSSUser(User user);
	void sndMsg(String msg,User user);
}
