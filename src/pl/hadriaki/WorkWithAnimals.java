package pl.hadriaki;

public class WorkWithAnimals {

	public static void main(String[] args) {
		
		Dog arlo = new Dog();
		arlo.setName("Arlo");
		System.out.println(arlo.getName());
		arlo.digHole();
		arlo.setWeight(23);
		System.out.println(arlo.getWeight());
		System.out.println(arlo.getSound() + "\n");

		Cat mewto = new Cat();
		mewto.setName("Mewto");
		System.out.println(mewto.getName());
		System.out.println(mewto.getSound() + "\n");
		
		//Crate objects with the superclass
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says:" + doggy.getSound());
		System.out.println("Kitty says:" + kitty.getSound() + "\n");
		
		//Using object array
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says:" + animals[0].getSound());
		System.out.println("Kitty says:" + animals[1].getSound() + "\n");
	
		//Sending Animal object for processing inside method
		//Pass any object to call the correct method
		speakAnimal(doggy);
				
	}
	
	public static void speakAnimal(Animal randAnimal){
		
		System.out.println("Animal says: " + randAnimal.getSound());
		
	}
}
