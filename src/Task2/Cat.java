package Task2;

public class Cat extends Animal {

    private String  breed, color;

    Cat(String animalName) {
       name= animalName;
    }

    @Override
    public void makeNoise() {
      //  super.makeNoise();
        System.out.println(name+" мяукает.");
    }

    @Override
    public void eat() {
        System.out.println(name+" сладко ест.");
    }

    @Override
    public void sleep() {
        System.out.println(name+" крепко спит.");
    }

    public void setBreed (String cat_breed){
        breed=cat_breed;
    }
    public void setColor (String cat_color){
        color=cat_color;
    }

}
