/*
                     Being
          /     \                   \             \
        Human    extraterrestrial    Cat         Friend
        /    \                         \
      Worker Student                   Pet
     / \       / \
             HS    College
 */


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Object {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat();
        cats[0].setName("Bob"); // <-- WHAT'S WRONG!

        Being crookshanks = new Cat();

        Being dentist = new Dentist("Dr. Tooth");
        Doctor dentist2 = new Dentist("Dr. Smile");

        Object dentist3 = new Dentist("Blah");

        Object num = 5;

        Object num2 = 5.5;

        Object name = "john";

        Object[] nums = {num, num2, name, dentist};





        Cat cat =new Cat();


        Being et = new Being("Bob");
        et.setName("ET - phone home");
        Pet pet = new Pet("fifi");
        pet.setName("Fifi");
        Doctor doc = new Doctor("Strange");
        doc.setName("Dr. House");

        System.out.println("###############");
        System.out.println("Doc's data!!!");
        System.out.println(doc.toString());
        System.out.println("###############");

        Friend bob = new Friend();

        bob.speak();
        doc.speak();
        et.speak();
        pet.speak();

        System.out.println("---- et ----");
        System.out.println(et);
        System.out.println("---- pet ----");
        System.out.println(pet);
        System.out.println("---- bob ----");
        System.out.println(bob);
    }
}

class Being extends Object {
    private String name;
    private int position;

//    public Being() {
//        this.name = "nameless";
//    }

    public Being() {
        // no name being!!
    }

    public Being(String name, int position) {
        this.name = name;
        this.position = position;
    }

    // alt+insert
    // right click + generate
    // context-aware


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

    public int getPosition() {
        return position;
    }

    public void speak() {
        System.out.println("hello!!!");
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nPosition: " + position;
    }
}

class Pet extends Being {
    private int age;

    public Pet(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nI am a cuddly pet!" +
                "\nand my age is: " + age;
    }
}

class Dentist extends Doctor {

    boolean ownsDrill;

    public Dentist(String name) {
        super(name);
    }
}

class Friend extends Being {
    private boolean brah;
    private static int friendCount = 0;

    @Override
    public void speak() {

    }

    public Friend() {
        super("NPC" + friendCount++);
    }

    @Override
    public String toString() {
        // easy pattern to follow
        // to make a toString name
        String o = "";

        o+=super.toString();

        if (brah == true) {
            o+= "\nwe can count on this friend.";
        } else {
            o+="\nNot a brah!";
        }

        return o;
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
class Animal extends Being {
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
