package sell.computer0;
public class SellerSingleton {
	
	private static SellerSingleton instance;
	
	private String gen = "man"; 
	private String  sellWhat;
	private int id ;
	static int  money;
	
	private SellerSingleton() {
	}
	public static SellerSingleton getInstance() {
		if(instance == null) {
			instance = new SellerSingleton();
		}
		return instance;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getSellWhat() {
		return sellWhat;
	}

	public void setSellWhat(String sellWhat) {
		this.sellWhat = sellWhat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}


	
	
}
