package test_abstract_2;

public class VegBerger extends Burger{

	@Override
	public void price(Double price) {
		System.out.println("O preço para o VegBerger é de: " + price);  // apenas um exemplo, para sabermos onde estamos
	}
}
