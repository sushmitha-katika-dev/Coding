package oops;

class Animal{
void sound(){ System.out.println("Animal");}
}

class Dog extends Animal{
void  sound(){ System.out.println("Bark"); }
}

class Cat extends Animal{
void sound(){ System.out.println("Meow");}
}

class Main{

public static void main(String []args){

Animal c = new Cat();
c.sound();

Animal d = new Dog();
d.sound();


}
}