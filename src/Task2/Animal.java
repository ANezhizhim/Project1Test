package Task2;

public class Animal {
    protected String food, location, name;

    public Animal(String anmlFood, String anmlLocation, String anmlName) {
        food = anmlFood;
        location = anmlLocation;
        name = anmlName;

    }

    public void makeNoise() {
        System.out.println(this.name + " Шумит.");
    }

    public void eat() {
        System.out.println(this.name + " ест.");

    }

    public void sleep() {
        System.out.println(this.name + " спит.");
    }       //, eat, sleep

    public void setFood(String anmlFood) {
        food = anmlFood;
    }

    public void setLocation(String anmlLocation) {
        location = anmlLocation;
    }
}
