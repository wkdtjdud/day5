package tset.constructor2;

public class USBMemory {
	
	private int capacity;
	private String color;
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	public void showInfo() {
		return capacity+"GB, "+ color +"색상";
	}
	
	public void writeMemory() {
		System.out.println(showInfo()+"의 USBMemory에 데이터를 저장한다");
	}
	
	public void readMemory() {
		System.out.println(showInfo()+"의 USBMemory에 데이터를 읽어온다");
	}
}
