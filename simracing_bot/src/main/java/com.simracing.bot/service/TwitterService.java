package main.java.com.simracing.bot.service;

import org.springframework.stereotype.Service;

@Service
public class TwitterService {

    private TwitterAuthService authService;

    public TwitterService(TwitterAuthService authService) {
        this.authService = authService;
    }

    // TO-DO construir header OAuth 1.0a e enviar POST request para o endpoint
    // (por agora só texto)
    private void postTweet(String text) {

    }

    // TO-DO: upload media (v1.1 endpoint) + criar tweet (v2 endpoint)
    public void postTweetWithMedia(String text, byte[] mediaBytes) {

    }
}
