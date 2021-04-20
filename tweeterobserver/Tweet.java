package tweeterobserver;

import java.util.ArrayList;
import java.util.List;

public class Tweet implements Tweets {
private List<TweeterUser> tUsers;
private String tweet;
public Tweet()
{
	this.tUsers=new ArrayList<TweeterUser>();
	}
@Override
	public void TweetUnfollow(TweeterUser tweeterUser) {
	this.tUsers.remove(tweeterUser);
	}

	@Override
	public void TweetFollow(TweeterUser tweeterUser) {
		
this.tUsers.add(tweeterUser);
tweeterUser.setTweet(this);
}

	@Override
	public void notifyTweeterUser() {
		for(TweeterUser tweeteruser:this.tUsers) {
			
			tweeteruser.tweetUpdate();
		}

	}

	@Override
	public String getTweetUpdate() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
		this.notifyTweeterUser();
	}

}
