import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {

	
	private String title;
	private String director;
	private int year;
	private List<String> cast;
	/**
	 * 
	 * @return gets the title of the movie
	 */
	public String getTitle()
	{
		return this.title;
	}
	/**
	 * 
	 * @return gets the director
	 */
	public String getDirector()
	{
		return this.director;
	}
	/**
	 * 
	 * @return gets the year 
	 */
	public int getYear()
	{
		return this.year;
	}
	public List<String> getCast()
	{
		return this.cast;
	}
	
	public String getType()
	{
		return"Movie";
	}
	
	/**
	 * a constructor for movie
	 * @param format
	 * @param isbn
	 * @param genre
	 * @param title
	 * @param director
	 * @param year
	 * @param cast
	 */
	public Movie(Format format, String isbn, String genre,String title,String director,int year, List<String> cast) {
		
		
		super(format, isbn, genre);
		this.cast=cast;
		this.cast.addAll(cast) ;
		this.title=title;
		this.director=director;
		this.year=year;
		
	}

	@Override
	public int compareTo(Media other) {
		
		if(other instanceof Movie)
		{
			if(this.compareTo(other)>0)
			{
				return -1;
			}
			else if( this.compareTo(other)<0)
			{
				return 1;
			}
			else {
				return 0;
			}
		}
		else if(other instanceof Book)
		{
			return -1;
		}
		else if(other instanceof Series)
		{
			return 1;
		}
		else if(other instanceof Music)
		{
			return 1;
		}
		else {
			return 0;
		}
		
		
	}
	
	public String toString() {
		
		return "Title: " + getTitle()+", Year: "+ getYear()+", "+super.toString();
	}

	



}