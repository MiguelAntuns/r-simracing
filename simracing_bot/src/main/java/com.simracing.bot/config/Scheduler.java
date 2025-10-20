import main.java.com.simracing.bot.service.RedditService;
import main.java.com.simracing.bot.service.TwitterService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    private RedditService redditService;
    private TwitterService twitterService;

    public Scheduler(RedditService redditService, TwitterService twitterService) {
        this.redditService = redditService;
        this.twitterService = twitterService;
    }

    @Scheduled(fixedRate = 7200000)
    public void postHottestPost() {
        var posts = redditService.getHottestPosts(300);
        if (posts.isEmpty()) return;

        var hottestPost = posts.get(0);
        var tweetText = hottestPost.getTitle()
    }
}