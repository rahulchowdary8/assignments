package junit5_assignments;

public class findminmax {
	
	int arr1[]=new int[2];
	public int[] findMinMax(int array[]) 
	{
		
		int max=0;
		int min=array[0];
		
		for(int i=0; i<array.length; i++ ) 
		{
	         if(array[i]>max) 
	         {
	            max = array[i];
	         }
	      }
		for(int i=0; i<array.length; i++ )
		{
	         if(array[i]<min) 
	         {
	            min = array[i];
	         }
	         
		}
		arr1[0]=min;
		arr1[1]=max;
		return arr1;
		
	}
	public int findMin(int array[]) 
	{
		int arr1[]=new int[2];
		int min=array[0];
		for(int i=0; i<array.length; i++ )
		{
	         if(array[i]<min) 
	         {
	            min = array[i];
	         }
	         
		}
		arr1[0]=min;
		return arr1[0];
		
	}
	public int findMax(int array[]) 
	{
		int arr1[]=new int[2];
		int max=0;		
		for(int i=0; i<array.length; i++ ) 
		{
	         if(array[i]>max) 
	         {
	            max = array[i];
	         }
	      }
		arr1[1]=max;
		return arr1[1];
		
	}
	
	public static void main(String[] args) {
		findminmax f=new findminmax();
		int array[]= {10,30,70,60,101,202,5};
		
		for (int i : f.findMinMax(array)) 
		{
			System.out.println(i);
			
		}
		int max=f.findMax(array);
		int min=f.findMin(array);
		System.out.println(min+" "+max);
	}
	

}
