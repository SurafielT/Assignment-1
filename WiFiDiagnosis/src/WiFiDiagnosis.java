import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		
		String option1 = "yes";
		Scanner scanner = new Scanner(System.in);
		
		
		
		// The introduction to the diagnosis test
		System.out.println("If you have a problem with internet "
				+ "connectivity, this Wifi Diagnosis might work.\n");
		
		/* ***********************FIRST STEP IN THE PROCESS***************************** */
		System.out.println("First step: reboot your computer"
				+ "\nAre you able to connect with the internet? (yes or no)");
		
		String choice = scanner.nextLine(); //INPUTTING YES OR NO
		
		if (choice.equals(option1)) 
		{
			System.out.print("\n\nProgrammer Name: Surafiel Tesfahun");
			System.exit(0);
		}
	
		
		/* ***********************SECOND STEP IN THE PROCESS***************************** */
		System.out.println("Second step: reboot your router"
				+ "\nNow are you able to connect to the internet? (yes or no)");
		
		String choice2 = scanner.nextLine(); //INPUTTING YES OR NO
		
		if (choice2.equals(option1))
		{
			System.out.print("\n\nProgrammer Name: Surafiel Tesfahun");
			System.exit(0);
		}
		
		
		/* ***********************THIRD STEP IN THE PROCESS***************************** */
		System.out.println("Third step: make sure the cables to your router are plugged in firmly "
				+ "and your router is getting power"
				+ "\nNow are you able to connect with the internet? (yes or no)");
		
		String choice3 = scanner.nextLine();
		
		if (choice3.equals(option1))
		{
			System.out.print("\n\nProgrammer Name: Surafiel Tesfahun");
			System.exit(0);
		}
		
		
		/* ***********************FOURTH STEP IN THE PROCESS***************************** */
		System.out.println("Fourth step: move your computer closer to your router"
				+ "\nNow are you able to connect with the internet? (yes or no)");
		
		String choice4 = scanner.nextLine();
		
		if (choice4.equals(option1))
		{
			System.out.print("\n\nProgrammer Name: Surafiel Tesfahun");
			System.exit(0);
		}
		
		/* ***********************FIFTH STEP IN THE PROCESS***************************** */
		System.out.println("Fifth step: contact your ISP "
				+ "\nMake sure your ISP is hooked up to your router.");
		
		
		System.out.print("\n\nProgrammer Name: Surafiel Tesfahun");
		
		scanner.close();

	}
	
}
