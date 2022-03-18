import java.util.Scanner;
public class Radius {
	public static double spherevolume(double radius) {
		return(4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double radius =0.0;
		System.out.println("enter volume:");
		radius=input.nextInt();
		System.out.println(spherevolume(radius));
		
		

	}

}
