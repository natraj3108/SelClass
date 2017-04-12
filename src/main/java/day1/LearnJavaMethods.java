package day1;

public class LearnJavaMethods {
	
	public static void main(String[] args1) {
		LearnJavaMethods lj = new LearnJavaMethods();
		/*int c = lj.add2Numbers(12, 4);
		System.out.println(c);*/
		boolean d = lj.isOdd(7);
		System.out.println(d);
		
	}
	
	public int add2Numbers(int a, int b){
		return a+b;
	}
	
	public int add3Numbers(int a, int b, int c){
		return a+b+c;
	}
	
	protected boolean isOdd(int a){
		
		if(a%2==0){
			return false;
		}
		
		return true;
		
	}
	
	public void printUpto100(){
		
		for (int i = 1; i < 101; i++) {
			
			System.out.println(i);
			
		}
		
		
		
	}

}















