
public class SearchFilter implements MediaFilter {

	
	private String searchTerm;
	
	public SearchFilter(String searchTerm )
	{
		this.searchTerm=searchTerm;
	}


	/**
	 * 
	 * @param label 
	 * @return returns a boolean and checks if the searchTerm matches the label value
	 */
	@Override
	public boolean matches(Label<String, Media> label) {
		String n = label.getValue().toString();
		
		
		if((n.indexOf(searchTerm))!= -1)
		{
			
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
}