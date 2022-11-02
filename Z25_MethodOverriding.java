
public class Z25_MethodOverriding {

	public static void main(String[] args) {
		
		// method overriding = Declaring a method in sub class,
		//                     which is already present in parent class.
		//                     Done so that child can give it's own implementation
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		dog.speak();
		animal.speak();

	}

}
