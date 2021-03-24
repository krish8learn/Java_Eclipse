package flow_control_statement;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = args[0].charAt(0);
		
		char ch1 = Character.toUpperCase(ch);
		
		switch (ch) {
		case 'R':
			System.out.println("R->Red");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default:
			System.out.println("Invalid Code");
		}

	}

}
