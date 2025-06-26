package recursion;

public class Sathya {
	public static int print(int a)//print is function name
	{
		if(a<=1) {
			return a;
		}
		else {
			
			 return  print(a-1)+print(a-2);// a*print(--a)
			 //1+print(2),2+print(3),3+print(4)  (sum of natural numbers) return a+print(a++)
			 //fibonacii  (n-1)+(n-2)
			 //
		}
	}

	public static void main(String[] args) {
		System.out.println(print(8));// call  the function and give input
		System.out.println("hii");
	}
}
