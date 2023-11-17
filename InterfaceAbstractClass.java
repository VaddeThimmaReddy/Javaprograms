package AbstractionMethods;

public class InterfaceAbstractClass {

	public static void main(String[] args) {
		Refer r = new Refer();
		r.m1();
		r.m2();
		r.m3();
		r.name();
	}
}
interface Name {
	public abstract void m1();
	public void m2();
	public void m3();
}
abstract class Name2 {
	public abstract void name ();
}
abstract class Name1 extends Name2 implements Name {
	public void m1() {
		System.out.println("abstract method of interface class ");
	}
	public void name () {
		System.out.println("abstract method of abstract class ");
	}
}
class Refer extends Name1 {
	public void m2() {
		System.out.println("Method 2");
	}
	public void m3() {
		System.out.println("Method 3");
	}
}