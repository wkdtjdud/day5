package tset.constructor2;

public class USBMemory {
	
	private int capacity;
	private String color;
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	public void showInfo() {
		return capacity+"GB, "+ color +"����";
	}
	
	public void writeMemory() {
		System.out.println(showInfo()+"�� USBMemory�� �����͸� �����Ѵ�");
	}
	
	public void readMemory() {
		System.out.println(showInfo()+"�� USBMemory�� �����͸� �о�´�");
	}
}
