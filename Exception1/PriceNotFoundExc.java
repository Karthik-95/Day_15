package Exception1;

public class PriceNotFoundExc {
	public static void main(String[] args) throws PriceNotFound {
		int price=20000;
		try {
		if(price<=28000) {
			throw new PriceNotFound("LOWER PRICE");
		}
		else {
			System.out.println("Price found");
		}
		}catch(PriceNotFound az) {
			System.out.println(az);
		}
	}

}
