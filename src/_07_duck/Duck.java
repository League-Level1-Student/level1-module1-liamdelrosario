package _07_duck;

public class Duck {

	
		// TODO Auto-generated method stub'
		int numberOfFriends;
		String favoriteFood;
		
		//Duck
		Duck(String favoriteFood, int numberOfFriends) {
		       this.favoriteFood = favoriteFood;
		       this.numberOfFriends = numberOfFriends;
		}
	
		void quack() {
			System.out.println("the duck quacks");
		}
		void waddle() {
			System.out.println("The duck waddle its feet");
		}

}