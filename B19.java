// abstract class implementation 
abstract class Animal
{
    Animal(){
        System.out.println("All Animals......!");
    }

    public abstract void Sound();
}
class Dog extends Animal
{
    Dog()  // it executes the superclass 
    {
        super();
    }
    public void Sound(){
        System.out.println("Dog is barking......");
    }

}
class Lion extends Animal
{
    Lion()   // it executes the superclass 
    {
        super();
    }
    public void Sound (){
        System.out.println("Lion is roaring........");
    }

}

class B19{
    public static void main (String []args){
        Dog d=new Dog();
        Lion l=new Lion();
        d.Sound();
        l.Sound();

    }
}