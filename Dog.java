abstract class Animal{
public abstract void animalSound();
}

class Dog extends Animal{
public void animalSound(){
System.out.println("woof");
}
public static void main(String[] args){
Animal obj= new Dog();
obj.animalSound();
}
}