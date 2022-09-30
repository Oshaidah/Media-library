
public interface MediaFilter {
	/**
	 * 
	 * @param label 
	 * @return an interface that checks if the parameter matches anything in the libaray
	 */
	 public boolean matches(Label<String, Media> label);

}
