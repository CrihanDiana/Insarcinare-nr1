
public class Main {

	public static void main(String[] args) {
		Animales dog = new Animales("Bobic");
		dog.setName_type("Domestic");
		dog.setSpecies("Terrestrial");
		dog.setAge(4);
		
		System.out.println(dog.getName_animal() );
		System.out.println(dog.getName_type() );
		System.out.println(dog.getSpecies() );
		System.out.println(dog.getAge() );
		
		dog.eat();
		dog.run();
	}

}
