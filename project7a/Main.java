package com.project7a;

class Main {
	public static void main(String[] args) {
		// creating object for child class
		Dog obj = new Dog();
		obj.name = "naresh";
		obj.display();
		// calling parent class method with child class object reference
		obj.cat();
	}
}
