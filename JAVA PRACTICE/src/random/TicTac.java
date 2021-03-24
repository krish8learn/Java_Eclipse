package random;

public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input1 = {1,2,9,5,7,8};
		System.out.println(win(input1));
	}
	
	public static String win(int input[])
	{
		String ret = "";
		String dataX = "";
		String dataO = "";
		String[] row = {"123","456","789","321","654","987"};
		String [] column = {"147","258","369","741","852","963"};
		String[] diagonal = {"753","357","951","159"};
		
		// converting X and O chances together into String
		for(int i=0;i<input.length;i++)
		{
			if(i==0||i%2==0)
			{
				//for X turns(0,2,4)
				dataX += String.valueOf(input[i]);
				
			}
			else if(i%2!=0)
			{
				//for O turns (1,3,5)
				dataO +=String.valueOf(input[i]);
			}
		}
		
		//System.out.println(dataX+"and"+dataO);
		
		//for X turns 
		for(int i=0;i<column.length;i++)
		{
			if(dataX.equals(column[i]))
			{
				ret = "X:"+"c"+String.valueOf(i+1);
			}
		}
		for(int i=0;i<row.length;i++)
		{
			if(dataX.equals(row[i]))
			{
				ret = "X:"+"r"+String.valueOf(i+1);
			}
		}
		for(int i=0;i<diagonal.length;i++)
		{
			if(dataX.equals(diagonal[i]))
			{
				ret = "X:"+"d"+String.valueOf(i+1);
			}
		}
		
		//for O turns
		for(int i=0;i<column.length;i++)
		{
			if(dataO.equals(column[i]))
			{
				ret = "O:"+"c"+String.valueOf(i+1);
			}
		}
		for(int i=0;i<row.length;i++)
		{
			if(dataO.equals(row[i]))
			{
				ret = "O:"+"r"+String.valueOf(i+1);
			}
		}
		for(int i=0;i<diagonal.length;i++)
		{
			if(dataO.equals(diagonal[i]))
			{
				ret = "O:"+"d"+String.valueOf(i+1);
			}
		}
		return ret;
	}

}
