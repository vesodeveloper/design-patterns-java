package tweeterobserver;

public class TweetFollower implements TweeterUser {
	private String title;
	
private Tweets tweet1;

	@Override
	public void tweetUpdate() {
		if(tweet1==null) {
			System.out.println(this.getTitle()+"has no title");
			return;
			
		}
		
		
String newTweet=this.tweet1.getTweetUpdate();
System.out.println(this.getTitle()+"has an"+newTweet);

	}
	public TweetFollower(String title) {
		
		this.setTitle(title);
		
	}

	@Override
	public void setTweet(Tweets tweet) {
		// TODO Auto-generated method stub
		this.tweet1=tweet;

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
