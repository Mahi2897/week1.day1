package week1.day2;

public class MyCalculator {
	
	
	public int add(int n1,int n2,int n3){
		int sum=n1+n2+n3;
		System.out.println("sum of the digit  :"+sum);
		return sum;
		}
	
	public int sub(int n1,int n2) {
		int sub=n1-n2;
		System.out.println("sub of the digit:"+sub);
		return sub;
	}
	public double Multiply(double n1, double n2) {
		double multiply=n1*n2;
		System.out.println("multiplication:"+multiply);
		return multiply;
	}
	public   float division(float n1, float n2) {
		float divide=n1/n2;
		System.out.println(  "division:"+divide);
		return divide;
		
	}
	
	public static void main(String[] args) {
		MyCalculator objcal=new MyCalculator();
		objcal.add(7, 5, 4);
		objcal.sub(7, 5);
		objcal.division(98, 2);
		objcal.Multiply(6, 4);
		
		// TODO Auto-generated method stub

	}

}
