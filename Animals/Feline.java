public class Feline extends Animal {
	String food = "meat";
	String time = "by day";
	String group = "in pack";
	String noise = "growl";

	public void makeNoise() {
		System.out.println("I say " + noise);
	}

	public void eat() {
		System.out.println("I eat " + food);
	}

	public void sleep() {
		System.out.println("I sleep " + time);
	}

	public void roam() {
		System.out.println("I travel " + group);
	}
}
