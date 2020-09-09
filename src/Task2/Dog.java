package Task2;

public class Dog extends Animal {

    private String  breed, color;

    Dog (String animalName) {
        name= animalName;
    }
    @Override
    public void makeNoise() {
        //  super.makeNoise();
        System.out.println(name+" гавкает.");
    }
    @Override
    public void eat() {
        System.out.println(name+" сладко ест.");
    }
    @Override
    public void sleep() {
        System.out.println(name+" крепко спит.");
    }

    public void setBreed (String dog_breed){
        breed=dog_breed;
    }
    public void setColor (String dog_color){
        color=dog_color;
    }

}
