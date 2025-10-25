package abstraction;

public abstract class MathsTeacher extends Teacher {
			
	@Override
	void work() {
		System.out.println("Maths Teacher Constructor called!!!");

	}
	@Override
	public void work1() {
		System.out.println("Maths Teacher teaches Algebra and Calculus.");

	}

}
