import java.io.Serializable;

public class Streaming implements Serializable {
    private final String streamingId;
    private final String streamingMedia;
    private final String location;

    public Streaming(String streamingId, String streamingMedia, String location) {
        this.streamingId = streamingId;
        this.streamingMedia = streamingMedia;
        this.location = location;
    }

    public String getStreamingId() {
        return streamingId;
    }

    public String getStreamingMedia() {
        return streamingMedia;
    }

    public String getLocation() {
        return location;
    }
}
