import java.util.Scanner;
public class Arithmeticopp {

	public static void main(String[] args) {
		int num1,num2,sum,diff,product,div;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1 & num2:" );
		num1= sc.nextInt();
		num2= sc.nextInt();
		sum=num1+num2;
		diff=num1-num2;
		product=num1*num2;
		div=num1/num2;	
		System.out.println("sum of 2 num is:"+sum );
		System.out.println("diff of 2 num is:"+diff );
		System.out.println("product of 2 num is:"+product );
		System.out.println("div of 2 num is:"+div );
		}

}
