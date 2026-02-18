public class Dog {
    // by best practice/convention
    // all instance variables
    // should be private
    // and we should create
    // setters/getters
    // to allow access
    // in the way that we decide
    private int age;
    private String name;

    public Dog() {
        age = 0;
        name = "Unnamed Dog";
    }

    // setter or mutator
    // pattern is (almost) always
    // the same
    // public + void + set + name of variable + ( data type of the thing you're trying to change + name of parameter)
    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 1000) {
            // error!
            System.out.println("That's outside of a typical range of a dog's age!");
        } else {
            age = newAge;
        }
    }

    public void setName(String name) {
        if (name.equals("F#$(*&#!$")) {
            System.out.println("You can't name your dog that!");
        } else {
            this.name = name;
        }
    }

    // getters or accessor
    // follow pattern
    // public + return type = whatever type of the thing you are trying to get + get + name of var + (no params)
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    boolean sameAge(Dog anotherDog) {
        // age is fluffy's age
        // anotherDog is airBud
        if (this.age == anotherDog.age) {

        }
    }
}

// Driver class
class DogDriver {
    public static void main(String[] args) {
        Dog airBud = new Dog();
        //airBud.age = 999;
        airBud.setAge(99);

        Dog fluffy = new Dog();

        if (fluffy.sameAge(airBud)) {
            // fluffy and airBud are the same age
            System.out.println("They're same age!");
        } else {
            System.out.println("They're NOT the same age!");
        }

    }
}
