package test.access1;

public class AAA {
	public void tset() {
		AccessBase ab = new AccessBase();
		//System.out.println("n1(private) = "+ab.n1); //private �ʵ�� ���� ��Ű������ ���� �Ұ���
		System.out.println("n2(public) = "+ab.n2);
		System.out.println("n3(protected) = "+ab.n3);
		System.out.println("n4(default) = "+ab.n4);
		
	}

}
