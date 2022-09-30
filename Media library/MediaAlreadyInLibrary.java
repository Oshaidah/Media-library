
public class MediaAlreadyInLibrary extends Exception {
	
	private String name;
	private Media media;
	
	
	
	public String getName()
	{
		return this.name;
	}
	public Media getMedia()
	{
		return this.media;
	}
	/**
	 * 
	 * @param name  the name of the media 
	 * @param media the type of media
	 * @throws a exception class, throws a MediaAlreadyInLibrary exception 
	 */
	public MediaAlreadyInLibrary(String name, Media media)
	{
		super( "Media already in library.");
		this.name=name;
		this.media=media;
			
			
		
		
	}

}
