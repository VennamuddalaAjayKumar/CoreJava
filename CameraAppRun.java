package abstraction.interfaces;

public class CameraAppRun implements CameraApp, Samsung, Iphone, Oneplus {

	@Override
	public void click() {
		System.out.println("To click the photos");
		
	}

	@Override
	public void record() {
		System.out.println("To record the  videos");
	}
	public static void main(String[] args) {
		CameraAppRun run = new CameraAppRun();
		run.click();
		run.record();
	}
}
