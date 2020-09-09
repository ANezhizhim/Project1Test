package Task2;

public class Main2 {
    public static void main(String[] args) {
    Cat Cat1=new Cat("Barsic");
    Cat1.makeNoise();
    Cat1.setFood("Wiscas");
    Cat1.setLocation("квартира");

    Dog Dog1=new Dog("Sharik");
    Dog1.makeNoise();
    Dog1.setFood("Кость");
    Dog1.setLocation("Будка");

        Hourse Hourse1=new Hourse("Иван Николаевич");
        Hourse1.makeNoise();
        Hourse1.setFood("Чипсы");
        Hourse1.setLocation("Ипподром");


    Veterinar Veterinar1= new Veterinar();

    Animal animals[]={Cat1,Dog1,Hourse1};
        for (Animal anm: animals) {
         Veterinar1.treatAnimal(anm);
        }

    }

}
/*
Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы
makeNoise, eat, sleep. Метод makeNoise, например, может выводить
на консоль "Такое
-то животное спит". Dog, Cat, Horse
переопределяют методы makeNoise, eat. Добавьте переменные в
классы Dog, Cat, Horse, характеризующие только этих животных.
Создайте класс Ветеринар, в котором определите метод void
treatAnimal(Animal animal). Пусть этот метод распечатывает food и
location пришедшего на прием животного. В методе main создайте
массив типа Animal, в который запишите животных всех имеющихся
у вас типов. В цикле отправляйте их на прием к ветеринару.

 */