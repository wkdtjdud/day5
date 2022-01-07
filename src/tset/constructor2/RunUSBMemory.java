package tset.constructor2;

public class RunUSBMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USBMemory u1 = new USBMemory(64, "Black");
		USBMemory u2 = new USBMemory(128, "Red");
		
		u1.readMomory();
		
		u2.writeMemory();
		u2.readMomory();

	}

}
