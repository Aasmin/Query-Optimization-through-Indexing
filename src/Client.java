import oui.*;
/**
 * Organization: Panjab University . Western University	
 * Email: akainth4@uwo.ca 
 * Final Year University Research Project.
 */

public class Client {

	public static void main(String[] args) throws Exception {
		DataManager.basedir = args[0];
		App app = new App();	//fires the app 
	}
}
