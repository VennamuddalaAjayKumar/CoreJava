package polymorphism.methodoverloading;

public class Whatsapp {
	public String sendMessage(String sendMessage) {
		return sendMessage;
	}
	public String sendMessage(String sendMessage, String recipient) {
		return "Message to" +recipient+" : "+ sendMessage;
	}
	public String sendMessage(int userid) {
		return "Sending message to user with ID: " +userid;
	}
}
