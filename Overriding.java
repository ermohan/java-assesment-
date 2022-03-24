
public class Overriding {
	public void run() {
		System.out.println("rider can ride the bike");
	}
}
class Ram extends Overriding{
	public void run() {
		System.out.println("ram can ride the bike");
	}
}
public class Test{

	public static void main(String[] args) {
		Overriding a=new Overriding();
		Overriding b=new Ram();
		a.run();
		b.run();
		
		}

}
