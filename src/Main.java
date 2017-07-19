

public class Main {

    public static void main(String[] args) {
	EmailNotification email = new EmailNotification("hey","watchu up too","main chick", "yahoo");
	TextNotification text = new TextNotification("whats good", "whats the move", "my dawg", "AT&T");
		
	    email.transport();
	    text.transport();
	    email.sometext();

		try {
			Object emailNotificationClone = email.clone();
			if (email.equals(emailNotificationClone)){
				System.out.println("email and clone are equvilent");
			}else{
				System.out.println("email does not equal clone");
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}




	}
}
