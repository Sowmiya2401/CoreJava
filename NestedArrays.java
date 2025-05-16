package javaPractice;

public class NestedArrays {
	
	public void SampleNested()
	{
		int a[][] = {{2,4,5},{0,6,7},{7,8,9}}; 
		
		int i, j;
		int max = a[0][0];
		int maxrow;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if (a[i][j]>max)
				{
					max = a[i][j];
					
				}
			}
			
		}
		System.out.println(max);
		
	}
	public void PrintNumbers()
	{
		/* 1
		 * 2 3
		 * 4 5 6
		 * 7 8 9 10
		 */
		int k=1;
		for(int i=0;i<6;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("\n");
		}
	
	}
	public void ReversePrint()
	{
		/* 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		
		int k=1; 
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("\n");
		}
	}
	public void PrintSame()
	{
		/* 1
		 * 1 2 
		 * 1 2 3
		 * 1 2 3 4
		 */
		for(int i=0;i<4;i++)    //outerloop
		{
			for(int j=1;j<=i+1;j++)   //innerloop
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
	public void Multiple()
	{
		/* 3 
		 * 6    9
		 * 12   15   18 
		 */
		int k=3;
		for(int i=0;i<3;i++)    //outerloop
		{
			for(int j=1;j<=i+1;j++)   //innerloop
			{
				System.out.print(k);
				System.out.print("\t");
				k+=3;
			}
			System.out.println("\n");
		}
	}
	
	public void Min()
	{
		/* 2 4 5
		 * 3 4 7
		 * 1 -6 9
		 * print smallest number in the array
		 */
		int a[][] = {{2,4,5},{3,4,7},{1,-6,9}}; 
		int min = a[0][0];
		int minI =0, minJ =0;
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++)
			{
				
			if(a[i][j]<min)
			{
				min=a[i][j];
				minI = i;
				minJ =j;

			}
		}
			
		}
		System.out.println(min);
		System.out.println("Index of lowest number: " + minI + " " +minJ);
		
	}
	public void MinMax()
	{   
		/* print min number and also print the largest number from the same column */
		int a[][] = {{2,4,5},{3,8,-6},{6,2,9}}; 
		int min = a[0][0];
		int minI =0, minJ =0;
		for(int i=0;i<3;i++)
		{ 
			for(int j=0;j<3;j++)
			{
				
			if(a[i][j]<min ) 
			{
				min=a[i][j];
				minJ =j;

			}
		}
			
		}
		System.out.println("minimum value" +min);
		System.out.println("Index of lowest column: " + " " +minJ);
		int k=0; 
		int max = a[0][minJ];
		while(k<3)
		{
			if(a[k][minJ]>k)
			{
				max = a[k][minJ];
			}
			k++;
		}
		  System.out.println("maximum number in the column " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   
		   NestedArrays ar = new NestedArrays(); 
		   ar.Min();
		   ar.MinMax();
	}

}  



   
   