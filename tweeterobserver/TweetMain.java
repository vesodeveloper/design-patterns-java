package tweeterobserver;

public class TweetMain {

	public static void main(String[] args) {
Tweet  tweet=new Tweet();
TweetFollower tf1=new TweetFollower("TFollower 1");
TweetFollower tf2=new TweetFollower("TFollower 2");
TweetFollower tf3=new TweetFollower("TFollower 3");
tweet.TweetFollow(tf1);
tweet.TweetFollow(tf2);
tweet.TweetFollow(tf3);
tweet.setTweet("SoC Microprocessors");
tweet.setTweet("GNU/Linux OS for older computers");
tweet.setTweet("C system programming");
	};
}


