public class Coins {
	public static void main(String[] args) {
	   // gets a number of cents as a command-line argument and prints how to represent the 
	   //quantity using as many quarters as possible plus the remainder in cents
		int a= Integer.parseInt(args[0]);
		int b= a/25;
		int c= a%25;
		System.out.println("use "+b+" quarters and "+c+" cents");
}
}