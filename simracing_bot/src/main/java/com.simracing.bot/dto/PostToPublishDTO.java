package main.java.com.simracing.bot.dto;

public class PostToPublishDTO {

    private String text;
    private String mediaUrl;
    private boolean isVideo;

    public void setText(String text) {
        this.text = text;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public void setVideo(boolean video) {
        isVideo = video;
    }

    public String getText() {
        return text;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public boolean isVideo() {
        return isVideo;
    }
}
