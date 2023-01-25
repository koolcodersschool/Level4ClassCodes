package day2;

public class AppleStore {
	
	public static void main(String[] args) {
		AppleWatch iWatch = new AppleWatch();
		iWatch.name = "Apple Watch";
		iWatch.series = 5;
		iWatch.use();
		iWatch.wear();
		iWatch.countSteps();
		
		System.out.println("================IPHONE TEST=====================");
		
		IPhone iPhone = new IPhone();
		iPhone.name = "IPhone";
		iPhone.model = "14 PRO";
		iPhone.navigate();
		iPhone.code();
		iPhone.wear();
		iPhone.use();
		
		System.out.println("===================MAC PRO===========================");
		MacPro macPro = new MacPro();
		macPro.name = "MacPro";
		macPro.model = "MacPro 13";
		macPro.code();
		macPro.use();
		macPro.useAsServer();
		
		
		
	}

}
