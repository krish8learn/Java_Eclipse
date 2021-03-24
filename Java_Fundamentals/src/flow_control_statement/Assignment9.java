package flow_control_statement;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please enter the month in numbers");
			System.exit(0);
		}
		
		int month = Integer.parseInt(args[0]);
				
			
		if (month < 1 || month > 6) {
			System.out.println("Invalid month");
			System.exit(0);
		}
		
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		default:
			System.out.println("Invalid Code");
		}
		
		
	}

}
