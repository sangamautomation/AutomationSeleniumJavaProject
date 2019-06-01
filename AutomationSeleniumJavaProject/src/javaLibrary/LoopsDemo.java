package javaLibrary;

public class LoopsDemo {

	public void arrayAscendingOrder(){
	int x[]={4, 8, 10, 2};
	int temp;
	for(int i=0;i<x.length;i++)
	{
	 for(int j=i+1;j<x.length;j++)
	 {
		if(x[i]>x[j])
		{
		 temp=x[i];
		 x[i]=x[j];
		 x[j]=temp;
		}
	 }
System.out.print(" " +x[i]);
	}
	}	

	
	public void arrayDescendingOrder(){
	{
		int a[]={5, 8, 3, 10}; //a[0]=5, a[1]=8, a[2]=3..
		
		
/*	a= 	5 < b = 8 
		
		temp = a = 5
		a = b = 8 
		b= temp = 5
		
	8    10   5 	 3  
		
	
	
	5 < 3? */
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		  {
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;			
			}
		  }
		System.out.print(" " +a[i]);
		}
	}

	}}
