package Exception;

public class Price {
	
	public void verifyPrice(int price) {
		if(price<=0) {
			throw new ProductException();
		}
			else {
				System.out.println("Accept the price");
			}
		}
	}


