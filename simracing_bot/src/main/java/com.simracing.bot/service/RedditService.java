package main.java.com.simracing.bot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.com.simracing.bot.dto.PostToPublishDTO;
import main.java.com.simracing.bot.dto.RedditDTO.RedditChild;
import main.java.com.simracing.bot.dto.RedditDTO.RedditResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Optional;

@Service
public class RedditService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String subredditURL = "https://www.reddit.com/r/simracing/hot.json";

    public String fetchRawPostJSON () {
        return restTemplate.getForObject(subredditURL, String.class);
    }

    public Optional<PostToPublishDTO> getTopHotPosts(int minUpvotes) {
        String rawJson = fetchRawPostJSON();

        try {
            ObjectMapper mapper = new ObjectMapper();
            RedditResponse response = mapper.readValue(rawJson, RedditResponse.class);

            return response.getData().getChildren().stream()
                    .map(RedditChild::getData)
                    .filter(post -> post.getUpvotes() >= minUpvotes)
                    .filter(post -> post.getUrl().endsWith(".jpg") || post.getUrl().endsWith(".png") || post.getUrl().endsWith(".gif") || post.getUrl().contains("v.redd.it"))
                    .map(post -> {
                        PostToPublishDTO dto = new PostToPublishDTO();
                        dto.setText(post.getTitle() + " " + post.getFullRedditURL());
                        dto.setMediaUrl(post.getUrl());
                        dto.setVideo(post.isVideo());
                        return dto;
                    })
                    .findFirst();
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
