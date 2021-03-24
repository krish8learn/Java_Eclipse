package string;

import java.util.Arrays;

public class Program3 {
	public static int[] program(int input1, int[] input2, int input3, int[] input4)
	{
		int [] output = new int [input3];
		
		
			//number of cold drink can buy each day
			for(int j=0;j<input3;j++)
			{
				int count=0;
				//money available on that day
				for(int k=0;k<input1;k++)
				{
					//price of cold drinks in each shop
					if(input4[j]>=input2[k])
					{
						count++;
					}
				}
				output[j]=count;
			}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 5;//total number of shops//
		int[] input2 = {3,10,8,6,11};//rates of the cold drinks in different shop
		int input3 = 4; //total days//
		int[] input4 =  {1,10,3,11};//money available on those days//
	    int[] show = program(input1,input2,input3,input4);
	    String sep = "";
	    System.out.print("{");
	    for(int i=0;i<input3;i++)
	    {
	    	System.out.print(sep+show[i]);
	    	sep=",";
	    }
	    System.out.print("}");
	    

	}

}
