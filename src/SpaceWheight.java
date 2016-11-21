import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.middlestead
 *
 */
public class SpaceWheight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double weight;
		double spaceweight;
		String body;
		
		System.out.println("what is your weight? ");
		weight = userInput.nextDouble();
		
		System.out.println("what is your planet? ");
		body = userInput.next();
		
		if (body.equalsIgnoreCase("mercury")){
			spaceweight = weight*0.38;
		}
		if (body.equalsIgnoreCase("venus")){
			spaceweight = weight*0.91;	
		
		}
		if (body.equalsIgnoreCase("earth")){
			spaceweight = weight*1;
			
		}
		if (body.equalsIgnoreCase("moon")){
			spaceweight = weight*0.165;
			
		}
		if (body.equalsIgnoreCase("mars")){
			spaceweight = weight*0.38;
		}
		if (body.equalsIgnoreCase("jupiter")){
			spaceweight = weight*2.34;
			
		}
		if (body.equalsIgnoreCase("saturn")){
			spaceweight = weight*1.06;
			
		}
		if (body.equalsIgnoreCase("uranus")){
			spaceweight = weight*0.92;
			
		}
		if (body.equalsIgnoreCase("neptune")){
			spaceweight = weight*1.19;
			
		}
		if (body.equalsIgnoreCase("pluto")){
			spaceweight = weight*0.06;
		}
		}
}
