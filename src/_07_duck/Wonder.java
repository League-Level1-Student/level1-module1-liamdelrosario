package _07_duck;

public class Wonder {

	int DogFriends;
	String favoriteFood;
	//Dog
	Wonder(String favoriteFood, int DogFriends){
		this.favoriteFood = favoriteFood;
		this.DogFriends = DogFriends;
	}
	void bark(){
		System.out.println("The dog barks");
	}
	void smiles() {
		System.out.println("The dog is happy to see you");
	}
}
