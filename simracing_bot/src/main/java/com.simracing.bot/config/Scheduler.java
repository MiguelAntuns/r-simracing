package main.java.com.simracing.bot.config;

import main.java.com.simracing.bot.dto.PostToPublishDTO;
import main.java.com.simracing.bot.service.RedditService;
import main.java.com.simracing.bot.service.TwitterService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Optional;

/**
 *
 * - Executes 2 to 2 hours
 * - Obtains the post
 * - Extracts the title+link
 * - Calls TwitterService to post
 *
 */

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
        Optional<PostToPublishDTO> posts = redditService.getHottestPosts(300);
        if (posts.isEmpty()) return;

        PostToPublishDTO hottestPost = posts.get();
        var tweetText = hottestPost.getTitle();
        // twitterService.postTweetWithMedia();
    }
}