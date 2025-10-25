package polymorphism.methodoverriding;

public class TeacherRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.teach();
		Teacher mt = new MathsTeacher();
		mt.teach();
	}

}
