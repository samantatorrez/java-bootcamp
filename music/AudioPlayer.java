package music;

/**
 * @author Samanta
 * @version 1.0
 */
public class AudioPlayer implements TrackState {
	private TrackState trackState;

	public AudioPlayer(TrackState trackState) {
		this.trackState = trackState;
	}

	public void setState(TrackState trackState) {
		this.trackState = trackState;
	}

	@Override
	public String listeningMusic() {
		return trackState.listeningMusic();
	}

}
