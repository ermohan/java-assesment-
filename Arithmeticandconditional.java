import java.util.Scanner;
public class Arithmeticandconditional {
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("print a:");
	int a=in.nextInt();
	System.out.println("print b:");
	int b=in.nextInt();
	System.out.println("print c:");
	int c=in.nextInt();

	int sum =a+b+c;
	System.out.println("sum is"+ sum);
	int product=a*b*c;
	System.out.println("product is"+ product);
	int avg = sum/3;
	System.out.println("avg is"+ avg);
	if(a>=b && a>=c)
	{
	System.out.println("The largest number is" + a);
	}
	else if(b>=a && b>=c)
	{
	System .out.println("The largest number is" + b);
	}
	else
	{
	System .out.println("The largest number is" + c);
	}

	if(a<=b && a<=c)
	{
	System.out.println("The smallest number is" + a);
	}
	else if(b<=a && b<=c)
	{
	System .out.println("The smallest number is" + b);
	}
	else
	{
	System .out.println("The smallest number is" + c);
	}

	}
	
}


