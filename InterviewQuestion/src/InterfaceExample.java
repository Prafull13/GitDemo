interface animal {
	void animalSound();
	void sleep();
	void eat();
}

class Dog implements animal {
	public void animalSound() {
		System.out.println("The dog says: Boh Boh");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
	public void eat() {};
	
}

class Cat implements animal{
	public void animalSound() {
		System.out.println("The dog says: Meow Meow");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
	public void eat() {};
}

public class InterfaceExample {

	public static void main(String[] Args) {
		System.out.println("Hello WOrld ");
		Dog dj = new Dog();
		dj.animalSound();
		dj.sleep();
		Cat ca = new Cat();
		ca.animalSound();
	}
}