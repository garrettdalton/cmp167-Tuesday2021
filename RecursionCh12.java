
public class RecursionCh12 {

	public static int sum(int target) {
		if(target <= 0) {
			return 0;
		}
		else {
			return target + sum(target - 1);
		}
	}
	
	public static int fibonacci(int n) {
		if( n <= 1) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	//write a method that recursively finds the product
	public static int product(int target) {
		if(target <= 1) {
			return 1;
		}
		else {
			return target * product(target -1);
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		int result = sum(n); //expected value 55
		System.out.println(result);
		
		//0 1 1 2 3 5 8 13
		int fib = fibonacci(6);
		System.out.println(fib);
		
		int result2 = product(n);
		System.out.println(result2);
	}
	
	
}
