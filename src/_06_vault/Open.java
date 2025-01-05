package _06_vault;

public class Open {

	public static void main(String[] args) {
		Vault cap = new Vault();
			secretAgent bot = new secretAgent();
		int rob =bot.findCode(cap);
		if(rob==-1) {
			System.out.println("No plausible code");
		}
		
				cap.tryCode(rob);
				
				System.out.println(rob);
			
	}

}
