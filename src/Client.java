import oui.*;
/**
 * fires the app 
 */
public class Client {

	public static void main(String[] args) throws Exception {
		DataManager.basedir = args[0];
		App app = new App();	
	}
}