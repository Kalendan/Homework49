import java.util.ArrayList;
import java.util.List;

public class Mediaplayer {

    private List<Playable> playList = new ArrayList<>();

    public void addTrack(Playable playable) {
        playList.add(playable);
    }

public void addTaracks(Playable... playables) {
    for (Playable playable : playables) {
        playList.add(playable);
    }
    public void playAll() {
        for (Playable playable : playList) {
            playable.printInfo();
            playable.play();
        }
    }

}}
