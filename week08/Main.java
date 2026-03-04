/*
            Being
          /     \
        Human    extraterrestrial
        /    \
      Worker Student
     / \       / \
             HS    College
 */


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat =new Cat();


        Being et = new Being("Bob");
        et.setName("ET - phone home");
        Pet pet = new Pet("fifi");
        pet.setName("Fifi");
        Doctor doc = new Doctor("Strange");
        doc.setName("Dr. House");
    }
}

class Being {
    private String name;
    private int position;

//    public Being() {
//        this.name = "nameless";
//    }

    public Being(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spawn() {
        setPosition(5);
    }

    public void setPosition(int position) {
        if (position >= 0 && position <= 10) {
            this.position = position;
        }
    }
}

class Pet extends Being {
    private int age;

    public Pet(String name) {
        super(name);
    }
}

class Friend extends Being {
    private boolean brah;
    private static int friendCount = 0;

    public Friend() {
        super("NPC" + friendCount++);
    }
}

class Doctor extends Being {
    private String gradSchool;

    private String name; // this isn't a syntax error!

    public Doctor(String name) {
        super("Dr. " + name);
    }

    // Override annotation is checked
    // by compiler... MUST override
    // a method in a superclass
    // @Override
    public void heal(Pet pet) {

    }

    // this overrides something!
    @Override
    public void spawn() {
        this.setPosition(9);
    }
}
class Animal {
    public Animal() {
        System.out.println("Animal is made!");
    }
}

class Cat extends Mammal {
    public Cat() {
        // super();  <--- implicitly added if no explicit call is made
        System.out.println("Cat is made!");
    }
}

class Mammal extends Animal {
    public Mammal() {
        System.out.println("Mammal!");
    }
}
