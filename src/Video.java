import java.util.Objects;

public class Video implements Playable{

private String trackName;

    @Override
    public void play() {

    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
    }

    public Video(String trackName) {
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
        Video video = (Video) o;
        return Objects.equals(trackName, video.trackName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(trackName);
    }

    @Override
    public String toString() {
        return "Video{" +
                "trackName='" + trackName + '\'' +
                '}';
    }
}
