package test.this1;

public class RunPowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerTest p = new PowerTest();
		p.power(7);
		
		int x = 5, y=3;
		
		System.out.printf("%d�� 2�������� %d�Դϴ�.\n", x, y, p.power(x, y));
	}

}
