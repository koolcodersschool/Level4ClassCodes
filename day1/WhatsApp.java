package day1;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable {

	@Override
	public void sendMessage(String message) {
		System.out.println("WhatsApp - sending a message - " + message + " .....");		
	}

	@Override
	public void videoCall(String name) {
		System.out.println("WhatsApp - vidoe calling to " + name + "....");		
	}

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp - calling to " + contact + "....");		
		
	}

}
