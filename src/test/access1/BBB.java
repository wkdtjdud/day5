package test.access1;

import test.access1.AccessBase;

public class BBB {
	public void test() {
		AccessBase ab = new AccessBase();
		System.out.println("n2(public) = "+ab.n2);
		//System.out.println("n3(protected) = "+ab.n3);
		//System.out.println("n4(default) = "+ab.n4);
	}

}
