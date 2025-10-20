package main.java.com.simracing.bot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TwitterAuthService {

    @Value("${api-consumer-key}")
    private String CONSUMER_KEY;

    @Value("${api-consumer-secret}")
    private String CONSUMER_SECRET;

    @Value("${access-token}")
    private String ACCESS_TOKEN;

    @Value("${access-token-secret}")
    private String ACCESS_TOKEN_SECRET;


    public Map<String, String> getCredentials() {
        return Map.of(
                "consumerKey", CONSUMER_KEY,
                "consumerSecret", CONSUMER_SECRET,
                "accessToken", ACCESS_TOKEN,
                "accessSecret", ACCESS_TOKEN_SECRET
        );
    }
}