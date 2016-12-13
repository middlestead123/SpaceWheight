import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.middlestead
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double squareRoot;
		
		do {
			System.out.println("please enter a number");
			squareRoot = userInput.nextDouble();
			
			if(squareRoot < 0){
				System.out.println("please enter a positive number");
			} else {
				squareRoot = Math.sqrt(squareRoot);
			}
		} while (squareRoot < 0);
		
		System.out.println("squareRoot = " + squareRoot);
		
		userInput.close();

	}

}
