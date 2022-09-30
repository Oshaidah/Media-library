
 abstract class Media implements Comparable<Media> {
	
	 private String isbn;
	 private String genre;
	 private Format format;
	 /**
	  * 
	  * @return returns the isbn number 
	  */
	 public String getisbn() {
		 return this.isbn;
	 }
	 /**
	  * 
	  * @return returns the genre 
	  */
	 public String getGenre() {
		 return this.genre;
	 }
	 /** 
	  * 
	  * @return returns the foramt of the media
	  */
	 public Format getFormat() {
		 return this.format;
	 }
	 /**
	  * 
	  * @return abstract method that returns the Type of media
	  */
	public abstract String getType();
	/**
	 * 
	 * @param format the format of the media
	 * @param isbn the isbn number of the media
	 * @param genre the genre of the media
	 */
	public Media(Format format , String isbn , String genre ) {
		
		this.isbn = isbn;
		this.format= format;
		this.genre = genre;
		
	}
	/**
	 * @return returns a boolean if the 2 objects are equal
	 */
	public boolean equals(Object m) {
		
		if((m instanceof Media)&&((Media) m).getisbn().equals(this.getisbn()))
		{
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * @return a to string method returns a string
	 */
	public String toString() {
		return "Type: "+ getType()+", ISBN: "+getisbn()+", Genre: "+getGenre()+", Format: "+getFormat();
	}
	
	
	

}
