package Exception;

public class ProductException extends ArithmeticException {
	
	@Override
	public String getMessage() {
		return "Product value should be above zero";
		
	}

}
