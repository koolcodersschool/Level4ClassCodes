package day1;

public class CallCenter {
	
	public static void main(String[] args) {
		WhatsApp whatsApp = new WhatsApp();
		whatsApp.name = "WhatsApp 12.2";
		whatsApp.allOSCompatible = true;
		whatsApp.isFree = true;
		System.out.println(WhatsApp.APP_TYPE);
		System.out.println(WhatsApp.CAN_CALL);
		whatsApp.launch();
		WhatsApp.close();
		
		VoiceCallable.decline();
		whatsApp.accept();
		whatsApp.sendMessage("Do you want homework from the first class?");
		whatsApp.videoCall("Kerim");
		whatsApp.call("Senan");
		
		
		
	}

}
