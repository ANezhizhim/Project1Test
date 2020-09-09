package Task2;

public class Animal {
   protected String food, location, name;

    public void makeNoise (){
        System.out.println(this.name+" Шумит.");
    }
    public void eat (){
        System.out.println(this.name+" ест.");

    }
    public void sleep (){
        System.out.println(this.name+" спит.");
    }       //, eat, sleep

    public void setFood(String anml_food){
        food=anml_food;

    }

    public void setLocation(String anml_location){
        location=anml_location;

    }
}
