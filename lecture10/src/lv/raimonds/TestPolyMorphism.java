package lv.raimonds;

import lv.raimonds.polymorphism.Animal;
import lv.raimonds.polymorphism.Cat;
import lv.raimonds.polymorphism.Dog;

public class TestPolyMorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
	}

}
