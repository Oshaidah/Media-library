
public class Book extends Media {
	
	
	private String title;
	private String author ;
	private String publisher;
	/**
	 * 
	 * @return gets the title of the book
	 */
	public String getTitle()
	{
		return this.title;
		
	}
	/**
	 * 
	 * @return gets the author of the book
	 */
	public String getAuthor()
	{
		return this.author;
	}
	/**
	 * 
	 * @return gets the publisher of the book
	 */
	public String getPublisher()
	{
		return this.publisher;
	}
	/**
	 * @return returns the type of media
	 */
	@Override
	public String getType() {
		
		return "Book";
	}
	/**
	 * a constructor for book 
	 * @param format
	 * @param isbn
	 * @param genre
	 * @param author
	 * @param title
	 * @param publisher
	 */
	public Book(Format format, String isbn, String genre, String author, String title, String publisher) {
		super(format, isbn, genre);
		this.title=title;
		this.author=author;
		this.publisher=publisher;
	}
	public String toString()
	{
		return "Title: "+getTitle()+", Author: "+getAuthor()+", "+super.toString();
	}
	
	/**
	 * @return returns an int for the placemet of the media
	 */
	@Override
	public int compareTo(Media other) {
		
		if(other instanceof Book)
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
		else if ( other instanceof Series )
		{
			return 1;
		}
		else if(other instanceof Movie )
		{
			return 1;
			
		}
		else if( other instanceof Music)
		{
			return 1;
		}
		else {
			return 0;
		}
	}

}
