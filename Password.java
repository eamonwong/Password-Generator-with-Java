public class Password {

	public static void main(String[] args) {
		
		String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
		String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String num = "0123456789";
		String specialChars = "`~!@#$%^&*()-_=+:<>/?.,£";
		String combination = lower_cases + upper_cases + num + specialChars;
		
		
		
		int len = 7;
		
		char[] password = new char[len];
		Random r = new Random();
		
		for (int i = 0; i < len; i++) {
			password[i] = combination.charAt(r.nextInt(combination.length()));
					
		
			}
		System.out.println("Your generated password is " + new String(password));
		
		
	}

}
