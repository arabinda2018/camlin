
public class Test {
	// start of body
	Test() {
		System.out.println("hi");
	}

	Test(String a) {
		System.out.println(" your name " + a);
	throw new  ArabException ("hi");
	}
	Test(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Test t = new Test("arabinda");
		Test t2 = new Test(10, 20); 
	}

}// end of body
