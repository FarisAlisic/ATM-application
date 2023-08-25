package MainClass;

public class Main {
	
	public static void main(String[] args) {
		
		Database database = new Database();
		database.addCardInfo("Faris", "1111111111111111", "1234", "1000");
		
		Login login = new Login();
		login.loginView();
		}
}
