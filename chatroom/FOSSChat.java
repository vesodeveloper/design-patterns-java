package chatroom;

import java.util.ArrayList;
import java.util.List;

public class FOSSChat implements FOSSMediator {
private List<User> fossUsers;
	public FOSSChat() {
		this.fossUsers=new ArrayList<User>();
			}

	@Override
	public void addFOSSUser(User user) {
this.fossUsers.add(user);
	}

	@Override
	public void sndMsg(String msg, User user) {
		for(User fossUsr: this.fossUsers ) {
				if(msg=="addBot") {
			FOSSBoth both=new FOSSBoth();
			both.track(fossUsr, msg);
			
		}
if(user!=fossUsr) {
			fossUsr.rMessage(msg);}
			
		}

	}

	@Override
	public void removeFOSSUser(User user) {
this.fossUsers.remove(user);		
	}

}
