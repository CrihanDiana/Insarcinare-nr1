
public class Animales {
	private String name_animal;
	private String name_type;
	private String species;
	private int age;
	
	
	public Animales(String name_animal) {
		this.name_animal = name_animal;
	}
	public String getName_animal() {
		return name_animal;
	}
	public void setName_animal(String name_animal) {
		this.name_animal = name_animal;
	}
	public String getName_type() {
		return name_type;
	}
	public void setName_type(String name_type) {
		this.name_type = name_type;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// metode
	public void eat() {
		System.out.println("Animals eat");
	}
	
	public void run() {
		System.out.println("Animals run");
	}

}
