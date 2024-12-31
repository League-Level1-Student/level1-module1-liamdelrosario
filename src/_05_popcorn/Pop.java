package _05_popcorn;

public class Pop {

	public static void main(String[] args) {
		Popcorn bag = new Popcorn("caramel");
		Microwave wave = new Microwave();
		wave.putInMicrowave(bag);
		wave.setTime(204);
		wave.startMicrowave();
		bag.eat();
	}

}
