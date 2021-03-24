package collection.List;
import java.util.*;

public class ArrayList7 {
	public static void main(String[] args) {
		String[] abc = {"GIANT-TEDDY-BEAR","GIRAFFE","CAT","MEGA-BEAR","DOG","LION","BILLY-BEAR","BESTY-BEAR","MONKEY","BOBBY-BEAR","BUNNY-RABBIT","BENJAMIN-BEAR","KUNG-FU-PANDA","BROWN-BEAR","PINK-BEAR","BABY-ELEPHANT","BLUE-FISH","HIPPO","CUTE-PIG",
				"PIKACHU","DORAEMON","TORTOISE","CATER-PILLAR","CANDY-DOLL"};
		ArrayList<String> softtoys = new ArrayList<String>(Arrays.asList(abc));
		int origin = softtoys.size();
		System.out.println("total item-->"+origin);
		while(true)
		{		
			boolean availability = false;
			//int count =0;
			System.out.println("ENTER ITEM NAME:");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			//VALID INPUT CHECKING CODE
			for(int k=0;k<abc.length;k++)
			{
				if(input.contentEquals(abc[k]))
				{
					availability=true;
				}
			}
			if(availability==false)
			{
				System.out.println("INVALID INPUT");
			}
			else if(availability==true)
			{
				//CHECKING AVAILABILITY
				for(int i=0;i<softtoys.size();i++)
				{
					//count++;
					if(input.contentEquals(softtoys.get(i)))
					{
						//REMOVING THE ITEM AND PRINTING THE REMAINING LIST
						int pos = softtoys.indexOf(input);
						System.out.println(softtoys.get(pos)+" sold");
						softtoys.remove(pos);
						availability = false;
						for(int j=0;j<softtoys.size();j++)
						{
							System.out.print(j+1+"."+softtoys.get(j)+" ");
						}					
						System.out.println("\nITEM PRESENT:"+softtoys.size());
						break;
					}
				}
				if(availability==true )
				{
					System.out.println("item not available");
				}
			}
				sc.close();
		}
			
	}
}
