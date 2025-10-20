package main.java.com.simracing.bot.service;

import org.springframework.stereotype.Service;

@Service
public class TwitterService {

    private TwitterAuthService authService;

    public TwitterService(TwitterAuthService authService) {
        this.authService = authService;
    }

    private void postTweet(String text) {
        // TO-DO construir header OAuth 1.0a e enviar POST request para o endpoint
        // https://api.twitter.com/2/tweets
        // (por agora só texto)
    }

    public void postTweetWithMedia(String text, byte[] mediaBytes) {
        // TO-DO: upload media (v1.1 endpoint) + criar tweet (v2 endpoint)
    }
}
