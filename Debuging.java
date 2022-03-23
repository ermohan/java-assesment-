
public class Debuging {
	int a;
	String name;
	void display() {
		System.out.println(a+" "+name);
	}
	public static void main(String[]args) {
	Debuging s1= new Debuging();
	Debuging s2;
	s2=s1;
	s1.display();
	s2.display();
	}
	}
		