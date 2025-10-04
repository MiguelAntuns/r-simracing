package main.java.com.simracing.bot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "reddit")
public class RedditConfigs {

    private String clientID;
    private String clientSecret;
    private String userAgent;

    public String getClientID() {
        return clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
