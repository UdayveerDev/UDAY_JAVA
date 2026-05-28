abstract class parent2{
  public parent2(){
    system.out.println("this is a base2 constructor");
  }
  public void sayhello(){
    System.out.println("hello");
  }

  abstract public void greet();
  abstract public void greet2();

}

class child2 extends parent2{
  @Override
  public void greet(){
    System.out.println("")
  }
}