package lab10;
import java.util.Scanner;
public class postal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str , another = "y";
				
				Scanner scan = new Scanner(System.in);
				String answer = "";
				postal1 postal2[] = new postal1[10];
				int index = 0;
		        do {
		        	System.out.println("Enter Firstname  lastname zipcode: ");
		        	str = scan.nextLine();
		        	String temp[] = str.split(" ");		
					if (temp.length == 3) {
						postal2[index] = new postal1(temp[0], temp[1], String.format("%08d", Integer.parseInt(temp[2])));
						index++;
					} else {
						System.out.println("Invalid input");
					}
		        	System.out.println("Continue? (y/n): ");
		        	answer = scan.nextLine();
		        } while(answer.equals("y") && index < 10);
		        
		        System.out.format("Total number of Postal objects: %d \n", index);
		        for (int i = 0; i < index; i++) {
		        	System.out.println(postal2[i].toString());
		        	
	}
}
		        
}
	
	
