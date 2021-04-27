package chatroom;

public class FOSSChatMain {

	public static void main(String[] args) {
FOSSMediator fosschat1= new FOSSChat();
User u1= new FOSSUser(fosschat1, "nikiv");
User u2=new FOSSUser(fosschat1, "fikiv");
User u3=new FOSSUser(fosschat1, "mikiv");
u2.sMessage("addBot");

	}

}
