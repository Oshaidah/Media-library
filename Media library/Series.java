import java.util.ArrayList;
import java.util.List;

public class Series extends Media {

	private String title;
	private List<String> cast;
	private List<String> episodes;
	
	/**
	 * 
	 * @return gets the title of the series
	 */
	public String getTitle()
	{
		return this.title;
	}
	/**
	 * 
	 * @return gets the list of the cast
	 */
	public List<String> getCast()
	{
		return this.cast;
	}
	/**
	 * 
	 * @return gets the list of the episodes
	 */
	public List<String> getEpisodes()
	{
		return this.episodes;
	}
	/**
	 * a constructor for series
	 * @param format
	 * @param isbn
	 * @param genre
	 * @param title
	 * @param cast
	 * @param episodes
	 */
	public Series(Format format, String isbn, String genre,String title, List<String> cast,List<String> episodes) {
		super(format, isbn, genre);
		this.cast=cast;
		this.episodes=episodes;
		this.cast.addAll(cast);
		this.episodes.addAll(episodes);
		this.title=title;
	}

	public String toString()
	{
		return "Title: "+getTitle()+", "+super.toString();
	}
	

	@Override
	public int compareTo(Media other) {
		if(other instanceof Series)
		{
			if(this.compareTo(other)>0)
			{
				return -1;
			}
			else if (this.compareTo(other)<0)
			{
				return 1;
			}
			else {
				return 0;
			}
		}
		if(other instanceof Book)
		{
			return -1;
			
		}
		else if ( other instanceof Movie)
		{
			return -1;
		}
		else if(other instanceof Music)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
/**
 * @return returns a string of the type 
 */
	@Override
	public String getType() {
		
		return "Series";
	}
	
	

}
