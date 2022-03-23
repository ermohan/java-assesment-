public class Printdiviseof35 {
	public static void main(String[]args) {
		int i;
		int sum=0;
		for(i=1;i<=20;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum+" is the sum of diviser of 3 and 5");
	}
}
