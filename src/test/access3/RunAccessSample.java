package test.access3;

public class RunAccessSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample a1 = new AccessSample();
		a1.n1 = 100;
		a1.setN(88);
		
		System.out.printf("a1�� �����ϴ� AccessSample ��ü�� n1 �ʵ�: %d", a1.n1);
		System.out.printf("a1�� �����ϴ� AccessSample ��ü�� n2 �ʵ�: %d", a1.n2);
		

	}

}
