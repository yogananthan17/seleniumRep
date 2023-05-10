package week1.day4;

public class Calculator {
	public void addTwoNumbers(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
		
	}
	public void subtractTwoNumbers(int e, int f) {
		int d=e-f;
		System.out.println(d);
		
	}
	public void multipleTwoNumbers(double i, double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumbers(float x,float y) {
		float z=x/y;
	    System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator calc =new Calculator();
		calc.addTwoNumbers(23, 17);
		calc.subtractTwoNumbers(23, 17);
		calc.multipleTwoNumbers(23.23, 17.17);
		calc.divideTwoNumbers(100, 3);
		
				
	}
	

}
