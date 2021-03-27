import java.util.ArrayList;

public class Playlist implements IComponent{
	
	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();
	
	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		for(int i = 0; i<playlist.size(); i++) {
			playlist.get(i).play();
		}
		
	}

	@Override
	public void setPlaybackSpeed(float speed) {
	
		
	}

	@Override
	public String getName() {
		return this.playlistName;
	}
	
	public void add(Playlist experimentalPlaylist) {
		
	}
	public void add(Song experimentalSong1) {
		
	}

	

}
