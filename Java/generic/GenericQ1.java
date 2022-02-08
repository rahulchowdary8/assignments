import java.util.HashSet;

public class GenericQ1 <T>{
   private T id;
   private T name;
   private T dept;
    public GenericQ1(T id,T name,T dept) 
    {
    	this.id=id;
    	this.name=name;
    	this.dept=dept;
    }
    public void display()
    {
    	HashSet<T> H=new HashSet<>();
    	H.add(id);
    	H.add(name);
    	H.add(dept);
    	for (T e : H) {
    		System.out.println(e);
			
		}
    }
	
	public static void main(String[] args) {
		
	GenericQ1<String> str= new GenericQ1<String>("001","Rahul","Btech");
	str.display();

	}

}
