import java.util.Scanner;


public class ThirdLecture {
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String myName;
		
		pr("Please write your name: ");
		myName = myScanner.nextLine();
		//System.out.println(myName);
		
		//prln("This is our new method: :) ");
		prln(myName);
		prln("\nThe number of characters in your name is: " + myName.length());
		
		int[][] twoDArray = new int[2][4];
		
		twoDArray[0][0] = 1;
		twoDArray[0][1] = 2;
		twoDArray[0][2] = 4;
		twoDArray[0][3] = 5;
		
		twoDArray[1][0] = 2;
		twoDArray[1][1] = 4;
		twoDArray[1][2] = 5;
		twoDArray[1][3] = 9;
		
		twoDArray[1][2] += (twoDArray[0][2] + twoDArray[0][3]);
		
		//prln("\nat 2dArray[1][2]: " + twoDArray[1][2]);
		
		if (myName.length() > 15) {
			prln("\nYour name is too long!");
		} else if (myName.length() < 3) {
			prln("\nYour name is too short!");
		} else {
			
			switch (myName.length()) {
			case 4:
				prln("You have a 4 character name");
				break;
			case 5:
				prln("You have a 5 character name");
				break;
			case 6:
				prln("You have a 6 character name");
				break;	
			case 7:
				prln("You have a 7 character name");
				break;
			case 8:
				prln("You have a 8 character name");
				break;	
			case 9:
				prln("You have a 9 character name");
				break;
			case 10:
				prln("You have a 10 character name");
				break;
			default:
				prln("You have a long name (more than 10 characters!");
				break;
			}
		}
	}

	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}
