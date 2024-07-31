import java.util.Objects;

public class AudioTrack implements Playable {

    private String trackName;

    @Override
    public void play() {
        System.out.println("Playing:" + trackName);

    }

    public AudioTrack() {
        Playable.super();
        System.out.println("Audiotrack" + trackName);
    }

    public AudioTrack(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioTrack that = (AudioTrack) o;
        return Objects.equals(trackName, that.trackName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(trackName);
    }

    @Override
    public String toString() {
        return "AudioTrack{" +
                "trackName='" + trackName + '\'' +
                '}';
    }
}
