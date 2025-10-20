package main.java.com.simracing.bot.dto.RedditDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditPostDTO {

    private String title;
    private String url;
    private String permalink;

    @JsonProperty("upvotes")
    private int upvotes;

    @JsonProperty("is_video")
    private boolean isVideo;

    public RedditPostDTO(String title, String url, String permalink, int upvotes, boolean isVideo) {
        this.title = title;
        this.url = url;
        this.permalink = permalink;
        this.upvotes = upvotes;
        this.isVideo = isVideo;
    }

    public String getFullRedditURL () {
        return "https://reddit.com/" + permalink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }
}
