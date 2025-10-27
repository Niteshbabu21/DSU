public class multipleinheritanceex {
  public static void main(String[] args){
    DogImpl d = new DogImpl();
    d.eat();
    d.bark();

  }

}

interface Animal {
  void eat();
}

interface Dog extends Animal {
  void bark();
}

class DogImpl implements Dog {
  public void bark() {
    System.out.println("Woof! Woof!");
  }

  public void eat() {
    System.out.println("Eating dog food...");
  }
}
