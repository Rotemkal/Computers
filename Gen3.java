import java.util.Random;

public class Gen3 {
	public static void main(String[] args) {
		//generates three random integers in a given range,prints them
		// and prints the minimal number that was generated
		Random ran= new Random();
        int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		int range = (second-first)+1;
		int rand1 = ran.nextInt(range)+first;
		int rand2 = ran.nextInt(range)+first;
		int rand3 = ran.nextInt(range)+first;
		int min1= Math.min(rand1,rand2);
		min1 = Math.min(min1,rand3);
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("The minimal genetated number was "+min1);
	    }
    }