import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaLibrary {
	
	private List <Label<String, Media>> library;
	
	public MediaLibrary()
	{
		this.library = new ArrayList<>();
	}
	/**
	 * adds the media to the library and throws a MediaAlreadyInLibrary exception if there is a duplicate 
	 * @param name
	 * @param media
	 * @throws MediaAlreadyInLibrary
	 * 
	 */
	public void add(String name, Media media) throws MediaAlreadyInLibrary
	{
		
			
			Label<String,Media> mm = new Label<>(name,media);
			
			
			for(Label<String, Media> ele: library)
			{
				
				if(ele.equals(mm))
				{
					throw new MediaAlreadyInLibrary(name,media);
				}
			}
			
			
			
			library.add(mm);
			
		
		
	}
	/**
	 * 
	 * @param mediaFilter
	 * @return returns a filtered list of library
	 */
	public List<Label<String,Media>>filter(MediaFilter mediaFilter)
	{
		
		List<Label<String,Media>> NL = new ArrayList<>();
		for(Label<String, Media> lib:library)
		{
			if(mediaFilter.matches(lib))
			{
				
				NL.add(lib);
			}
		}
		return NL;
		
		
		
	}
	/**
	 * sorts the library list
	 */
	public void sort()
	{
		Collections.sort(library);
	}
	
	
	

}
