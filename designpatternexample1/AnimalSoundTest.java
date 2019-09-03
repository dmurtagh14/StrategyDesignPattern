package com.designpatternexample1;

public class AnimalSoundTest {

		int justANum;
		
		public static void main(String[] args) {
			
			Dog fideo = new Dog();
			Cat spike = new Cat();
			
			fideo.setName("Fideo");
			
			spike.setName("Spike");
			
			spike.setWeight(-10);
			
			fideo.setWeight(20);
			
			System.out.println(fideo.getWeight());
			
			System.out.println(spike.getSound());
			
			changeObjectName(fideo);
			
			System.out.println("Dog name after method call: 	"+ fideo.getName());
			
			//polymorphism
			Animal doggy = new Dog();
			Animal kitty = new Cat();
			
			System.out.println("Doggy says "+ doggy.getSound());
			System.out.println("Kitty says "+ kitty.getSound());
			
			Animal[] animals = new Animal[4];
			animals[0] = kitty;
			animals[1] = doggy;
			
			System.out.println("Doggy says "+ animals[1].getSound());
			System.out.println("Kitty says "+ animals[0].getSound());
			
			speakAnimal(doggy);
			//can cast dog class to doggy so method dighole can be called
			((Dog)doggy).digHole();

			fideo.accessPrivate();
			
			
			//abstract classes
			//abstract classes
			
			Giraffe giraffe = new Giraffe();
			
			giraffe.setName("Frank");
			System.out.println("Giraffe name: "+giraffe.getName());
			
		}
		
		public static void changeObjectName(Dog fideo) {
			fideo.setName("Marcus");
		}
		
		public static void speakAnimal(Animal randAnimal) {
			System.out.println("Animal says "+ randAnimal);
		}
		
		
		
		
}
