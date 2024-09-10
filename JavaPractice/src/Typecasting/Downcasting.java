package Typecasting;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}


public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Rule 1 : converstion is valid or not
		//The type of 'd' and 'c' mush have some relation ship 
		
		Animal an =new Dog();
		Cat ct=(Cat) an; //valid as per rule 1
		
//		Dog dg=new Dog();
//		Cat ct=(Cat) dg;  //invalid as per rule 1 becase there is no relationship between cat and dog
//		
//		//Rule 2: assignment or not 
//		
//		Animal an1 =new Dog();
//		Cat ct1=(Cat)an;  //it's valid bec cat is child of an
//		
//		
//		Animal an2 =new Dog();
//		Cat ct2=(Dog)an;  // an cat is not link with dog so invalid as per rule 2
//		
		
		//Rule 3: ubderlying object
		
		
		// rule 1 rule2 rule3 are valid now
		Animal an3 =new Dog();
		Dog g=(Dog) an3;
		
		//
	}

}
