package sell.computer0;

public class ComFactory {


	public Computer getCom(String computer, int price, String brand, String gen) {
		
		
		if(computer == null) {
			return null;
		}
		if(computer.equalsIgnoreCase("dell")) {
			System.out.println(computer+""+price);
			return new Dell(price,gen,brand);
		}
		if(computer.equalsIgnoreCase("lenovo")) {
			return new Lenovo(price,gen,brand);
		}
		return null;
	}




	
}
