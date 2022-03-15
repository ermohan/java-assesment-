import java.util.Scanner;
public class Devicer {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("print a:");
		int a=in.nextInt();
		System.out.println("print b:");
		int b=in.nextInt();
		if(b%a==0) {
			System.out.println("a is multiple of b");
		}

	}

}
