package abstraction.interfaces;

public class RemoteControllRunner implements Tv, Projector, Ac {

	@Override
	public void powerOn() {
		System.out.println("Power on the Devices");
	}

	@Override
	public void powerOff() {
		System.out.println("Power off the Devices");
		
	}

	public static void main(String[] args) {
		Tv remoteControllRunner = new RemoteControllRunner();
		remoteControllRunner.powerOn();
		remoteControllRunner.powerOff();
	}
}
