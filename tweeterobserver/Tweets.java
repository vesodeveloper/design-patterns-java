package tweeterobserver;

public interface Tweets {
void TweetUnfollow(TweeterUser tweeterUser);
void TweetFollow(TweeterUser tweeterUser);
void notifyTweeterUser();
String getTweetUpdate();
}
