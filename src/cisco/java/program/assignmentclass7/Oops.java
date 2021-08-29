package cisco.java.program.assignmentclass7;

abstract class Pen{
    abstract void write();
    abstract void refill();
}                                           					    //	Q1	->	abstract class pen

class FountainPen extends Pen{										//Q2	->	concrete class fountain pen
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{														//Q3 ->monkey class
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{												//interface	->Basic Animal
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{					//Q4	->Inherits monkey class and implement the basic animal interface	
    void study(){
        System.out.println("studying!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Oops{
    public static void main(String[] args) {
       
        FountainPen pen = new FountainPen();
        pen.changeNib();

       
        Human thish = new Human();
        thish.sleep();

        
        Monkey m = new Human();
        m.jump();
        m.bite();
        
        BasicAnimal A = new Human();
       
        A.eat();
        A.sleep();

    }
}

