
public class Client {

	
	public static void main(String[] args)  {
		Terre terre1 = Terre.getInstance();
		Terre terre2 = Terre.getInstance();
	
		terre1.afficher();

		
		if( terre1 == terre2 ) {
			System.out.println("Remarque: terre1 == terre2");
		}
	}
}
