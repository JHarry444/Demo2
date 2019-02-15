package main;

public class App {

	public static void main(String[] args) {
		BearNecessities bn = new BearNecessities();
		bn.init();
		System.out.println(bn.output());
		Object obj = new Place(null, null, 4);
	}
	

}
