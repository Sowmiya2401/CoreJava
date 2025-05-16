package javaPractice;

public class GradingSystem {
	
	    static double Avg =0; 
	    static String[] stunames = {"Sowmiya","Sangeetha","Roja","Rani","Megalai"};
    	static String[] subject = {"Tamil","English","Maths","Science","Social Science"}; 
	    
    	static int[][] studentmarks = {
    			{80,90,70,45,95},
    			{70, 65, 60, 75, 68},
    			{95, 98, 92, 91, 96},
    			{60,50,45,67,89},
    			{78,76,89,56,38}};
	        public static void studentInfo()
	        {
	        	
	        	
	        	for(int i=0;i<stunames.length;i++)
	        	{
	        		
	        		int totalmarks =0;
	        		for(int j=0;j<studentmarks.length;j++)
	        		{
	        			 
	        			totalmarks += studentmarks[i][j];
	        		   
	        		}
	        		Avg = totalmarks/5.0;
	        		//System.out.println(Avg);
	        		char grade = gradeCalc();
	        		System.out.println(stunames[i] + " overall achieved grade " + grade + " The average is " +Avg);
	        		
	        	}
	        	
	        	
	        }
	       public static char gradeCalc()
	       {
	    	   if(Avg>=90)
	    	   {
	    		   
	    		   return 'A';
	    		
	    	   }
	    	   if(Avg>=80)
	    	   {
	    		
	    		   return 'B';
	    	   }
	    	   if(Avg>=60)
	    	   {
	    		   
	    		   return 'C';
	    	   }
	    	   if(Avg<=60)
	    	   {
	    		   
	    		   return 'D';
	    	   }
	    	   else {
			      return 'F';
	    	   }
	       }
	       public static void printingStudentMarks()
	       {
	    	   //printing student names, subjects and marks as per the order 
	    	   
	    	   for(int i=0;i<stunames.length;i++)
	    	   {
	    		   for(int j=0;j<subject.length;j++)
	    		   {
	    			   
	    			   
	    			System.out.println(stunames[i] + " scored " + subject[j] + " in " + " " +studentmarks[i][j]);
	    				  
	 
	    		   }

	    	   }
	       }
	       public static void main(String[] args) {
	    	   
	    	   studentInfo();
	    	   printingStudentMarks();
	    	   
	       }
	       
	      
	
}
