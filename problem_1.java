

public class Main
{
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 1000; i++){
		    if(i % 3 == 0 || i % 5 == 0)
		        num += i;
		}
		System.out.println("The sum of all numbers dividable by 3 and 5 is " + num);
	}
}
