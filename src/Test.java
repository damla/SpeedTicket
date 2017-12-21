
import java.util.Scanner;

public class Test{

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the car's brand: ");
		String a=sc.nextLine();
	
		System.out.println("Please enter the car's plate: ");
		String c=sc.nextLine();
		
		System.out.println("Please enter the car's speed: ");
		int b=sc.nextInt();
		
		Car car1=new Car(a,b,c);
			
		car1.calculateSpeedTicket();
		
		sc.close();
	}
}
