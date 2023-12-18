public class Triangle {
	public static void main(String[] args) {
		//tests if three given integers form a triangle
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if(a+b>c && a+c>b && b+c>a) {
		    System.out.println("True");
		}
	    else {
		    System.out.println("False");
	    }
    }
}