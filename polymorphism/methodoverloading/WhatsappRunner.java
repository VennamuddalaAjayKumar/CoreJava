package polymorphism.methodoverloading;

public class WhatsappRunner {

	public static void main(String[] args) {
		Whatsapp w =new Whatsapp();
		System.out.println(w.sendMessage("Hi"));
		System.out.println(w.sendMessage("Hi", " Ajay"));
		System.out.println(w.sendMessage(12455));
	}

}
