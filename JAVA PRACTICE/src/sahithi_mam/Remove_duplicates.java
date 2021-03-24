package sahithi_mam;
import java.util.*;
public class Remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] abc = {2,3,4,2,5,5};
		//sorting the array
		for(int i=0;i<abc.length;i++)
		{
			for(int j=i+1;j<abc.length;j++)
			{
				if(abc[i]<abc[j])
				{
					int temp = abc[i];
					abc[i] = abc[j];
					abc[j] = temp;
				}
			}
		}
		//sorted array
		for(int i=0;i<abc.length;i++)
		{
			System.out.println(abc[i]+",");
		}
		System.out.println();
		/*removing duplicates*/
		int[] dup = new int[abc.length];
		int j = 0; 
        for (int i=0; i<abc.length-1; i++) 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (abc[i] != abc[i+1]) 
                dup[j++] = abc[i]; 
          
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        dup[j++] = abc[abc.length-1];    
          
        // Modify original array 
        for (int i=0; i<j; i++) 
        {
        	abc[i] = dup[i];
        	System.out.println(abc[i]+",");
        }
        
        
	}

}
