import java.util.Date;

class Pair<K,V>
{
	private K key;
	private V value;
	public Pair(K key,V value) 
	{
		this.key=key;
		this.value=value;
		System.out.println("key is:--> "+key+" (AND) "+" Value is:--> "+value);
	}
}
public class GenericQ4 {
public static void main(String[] args) 
{
	Pair<String,String> p=new Pair("1", "Hiiii");
	Pair<String,Date> p1=new Pair("Today is",new Date());
	
}
}
