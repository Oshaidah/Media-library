
public class Label<K,V extends Comparable<V>> implements Comparable<Label<K,V>> {

	private K key;
	private V value;
	/**
	 * 
	 * @return gets the key value 
	 */
	public K getKey()
	{
		return this.key;
	}
	/**
	 * 
	 * @return gets the value of label
	 */
	public V getValue()
	{
		return this.value;
	}
	public Label(K key,V value)
	{
		this.key=key;
		this.value=value;
	}
	/**
	 * @return returns a boolean if the object is a Label and if the values are the same
	 */
	public boolean equals(Object o)
	{
		
		if((o instanceof Label)&& ((Label) o).getValue().equals(this.getValue()))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	/**
	 * @return returns the int when comparing the 2 differnt values
	 */
	@Override
	public int compareTo(Label<K, V> o) {
		
		int comp = this.getValue().compareTo(o.value);
		return comp;
	}
	

}
