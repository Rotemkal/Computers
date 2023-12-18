public class LinearEq {
	public static void main(String[] args) {
		//solves linear equations of the form 𝑎 ⋅ 𝑥 + 𝑏 = 𝑐
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
		double d = c-b;
		System.out.println(a+"*x"+"+"+b+"="+c);
		System.out.println("x ="+d/a);
}
}