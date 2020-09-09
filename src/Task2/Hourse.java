package Task2;

public class Hourse extends Animal {

    private String  breed, color;

    Hourse(String animalName) {
        name= animalName;

    }

    @Override
    public void makeNoise() {
        System.out.println(name+" ржет.");
    }

    @Override
    public void eat() {
        System.out.println(name+" сладко ест.");
    }

    @Override
    public void sleep() {
        System.out.println(name+" крепко спит.");
    }

    public void setBreed (String hourse_breed){
        breed=hourse_breed;
    }
    public void setColor (String hourse_color){
        color=hourse_color;
    }
}
