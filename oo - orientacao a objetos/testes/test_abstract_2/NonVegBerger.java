package test_abstract_2;

public class NonVegBerger extends Burger {

	@Override
	public void price(Double price) {
		System.out.println("O preço para o NonVegBerger é de: " + price);  // apenas um exemplo, para sabermos onde estamos

	}
}
