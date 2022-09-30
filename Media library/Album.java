import java.util.ArrayList;
import java.util.List;

public class Album extends Music{

	private List<String> trackList;
	/**
	 * 
	 * @return gets the list of tracks
	 */
	public List<String> getTrackList()
	{
		return this.trackList;
	}
	
	public Album(Format format, String isbn, String genre, String artist, String title, int year,List<String> trackList) {
		super(format, isbn, genre, artist, title, year);
		this.trackList=trackList;
		this.trackList.addAll(trackList);
		
	}
	
	public String getType()
	{
		return"Album";
	}
	
	public String toString()
	{
		return super.toString()+", Tracks: "+getTrackList();
	}

	
	

}
