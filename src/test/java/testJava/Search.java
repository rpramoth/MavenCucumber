package testJava;

public class Search {

	
	public String searchProduct(Product product) {
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;
		
	}
	
}
