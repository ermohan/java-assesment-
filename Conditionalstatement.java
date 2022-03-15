import java.util.Scanner;
public class Conditionalstatement {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value of a b:");
		a= sc.nextInt();
		b= sc.nextInt();
		if(a<b){
			System.out.println("a is big");
		}
		else if(a==b){
			System.out.println("a is equal to b");
		}
				
		

	}

}
