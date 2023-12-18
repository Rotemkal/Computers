public class AddTwo {
	public static void main(String[] args) {
		//adds two given integers and prints the result
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a + b;
		System.out.println(a+ " + " +b + " = "+ sum);
}
}