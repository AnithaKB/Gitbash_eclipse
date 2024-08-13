package Exception;

public class DriverProduct {

	public static void main(String[] args) {
		Price price=new Price();
		
		try {
			price.verifyPrice(50);
		}catch(ProductException e) {
			System.out.println(e.getMessage());
		}

	}

}
