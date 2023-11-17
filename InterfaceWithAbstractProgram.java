package AbstractionMethods;

public class InterfaceWithAbstractProgram {

	public static void main(String[] args) {
		School sc = new School();
		sc.teacher();
		sc.parentName("Yerriswamy");
		System.out.println(sc.teacherName("Lenin Reddy"));
		System.out.println(sc.m1());
		System.out.println(sc.m2());
		System.out.println(sc.m3());
		System.out.println(sc.m4());
	}
}
interface Student {
	public abstract int m1();
	public abstract int m2();
	public abstract int m3();
	public abstract int m4();
}
interface Teacher {
	public abstract void teacher();
	public String teacherName(String x);
}
abstract class Parent {
	public abstract void parentName(String x);
}
class School extends Parent implements Student,Teacher {
	public void parentName(String x) {
		System.out.println(x);
	}
	public String teacherName(String x) {
		return x;
	}
	public void teacher() {
		System.out.println("Kuwaila");
	}
	public int m1() {
		System.out.println("First year total Marks : ");
		return 580;
	}
	public int m2() {
		System.out.println("Second year total Marks : ");
		return 555;
	}
	public int m3() {
		System.out.println("Third year total Marks : ");
		return 588;
	}
	public int m4() {
		System.out.println("Final year total Marks : ");
		return 594;
	}
}