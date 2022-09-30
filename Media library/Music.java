
abstract class Music extends Media {

	private String artist;
	private String title;
	private int year;
	/**
	 * @return getter method for the artitst
	 *
	 */
	public String getArtist(){
		return this.artist;
	}
	public String getTitle(){
		return this.title;
	}
	public int getYear(){
		return this.year;
	}
	
	public String toString()
	{
		return "Artist: "+getArtist()+", Year: "+getYear()+", Title: "+ getTitle()+", "+ super.toString();
				 
		
	}
	public Music(Format format, String isbn, String genre, String artist, String title, int year) {
		super(format, isbn, genre);
		this.artist=artist;
		this.title=title;
		this.year=year;
		
	}

	/**
	 * @return returns an int and it signifies the postion it should be sorted in 
	 */
		public int compareTo(Media other)
		{
			if(other instanceof Album)
			{
				if(((Album)other).getArtist().compareTo(this.artist)>0) {
					return -1;
				}
				else if(((Album)other).getArtist().compareTo(this.artist)<0)
				{
					return 1;
				}
				
				
				else
				{
					return 0;
				}
			}
			
			if(other instanceof Single)
			{
				if(((Single)other).getArtist().compareTo(this.artist)<0)
				{
					return 1;
				}
				else if (((Single)other).getArtist().compareTo(this.artist)>0)
				{
					return -1;
				}
				else {
					return 0;
				}
			}
			
			if(other instanceof Movie)
			{
				return -1;
			}
			else if(other instanceof Book)
			{
				return -1;
			}
			else if( other instanceof Series)
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
		}
	

	
	
	
		
	
	
	

}
