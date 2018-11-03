package com;
abstract class Animal {
    abstract String talk();
}

class Cat extends Animal {
    String talk() {
        return "Meow!";
    }
}

class Dog extends Animal {
    String talk() {
        return "Woof!";
    }
}

public class AnimalApplication{
	
	public static void main(String args[]) {

		callAnimals();
	}

	static void callAnimals() {
	    letsHear(new Cat());
	    letsHear(new Dog());
	}
	
	static void letsHear(Animal a) {
	    System.out.println(a.talk());
	}
}