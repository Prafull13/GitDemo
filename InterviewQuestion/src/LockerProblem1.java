public class LockerProblem1
{
  public static int status;
  
     public static void main(String []args)
     {
        int total = 0;
         
         int open = 1;
         int closed = 0;
         int lockers[] = new int[1101];		//An array used for simulating lockers
         
         for(int i = 0; i < 1100; i ++)		//For loop that closes all of the lockers to begin
         {					// In this particular case we are dealing with 322 lockers and 322 kids
             lockers[i] = 0; 
         }
         
         
         
         for (int kid = 1; kid < 1100; kid++)		//loop that simulates kids entering the building
         {

        	 for(int lockernum = 0; lockernum < 1100; lockernum = lockernum + kid)	//Nested for loop that simulates each kid closing or                                   opening lockers
        	 {
        		 
        		 
        			 if(lockernum == 0) //Sets the beginning locker number to the kid that has entered the school.
        			 {
        				 lockernum = kid;
        			 }
        			 if(kid >= 3)		// for non special case after kid 1 and 2. They will open or close the locker they arrive at.
        			 {
        				 if(lockers[lockernum] == closed)	//The kid checks to see if the locker is open, if it is they close it. If its closed they open it.
        				 {
        					 status = open;
        				 }	
        				 else
        				 {
        					 status = closed;
        				 }
        			 }
        			 if(kid == 2)			// special case for kid 2
        			 {
        				 status = closed;
        			 }
            		if(kid == 1)			// special case for kid 1
            		{
            			status = open;
            		}
            	
            		lockers[lockernum] = status; // sets the status of the locker
             }
         
         
        
     }
     
         
         
          for(int i = 1; i < 1100; i++)		//Loop for counting open lockers in your locker array 
          	{
        	  	System.out.println("Locker " + i + " " + lockers[i]);
        	  	
        	  	total = total + lockers[i];
          }
        
         System.out.println("Total  Open Lockers: " + total);
         System.out.println("Closed lockers: " + (1100 - total));
     }
     
     
   
}
