package Task3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Student student1=new Student(3.0D);
        Student student2=new Student(4.0D);
        Student student3=new Student(5.0D);
        Student aspirant1 = new Aspirant(3.0D, "Влияние радиации на рост телеграфных столбов");
        Student aspirant2 = new Aspirant(3.0D, "Влияние радиации на рост телеграфных столбов");
        Student aspirant3 = new Aspirant(5.0D, "Влияние радиации на рост телеграфных столбов");

        Student students[]={student1,student2,student3,aspirant1,aspirant2,aspirant3};

        for (Student std:
             students ){
            System.out.println(std.getScholarship());
        }
        
    }

}
/*
Создайте пример наследования, реализуйте класс Student и класс
Aspirant, аспирант отличается от студента наличием некой научной
работы.

∎ Класс Student содержит переменные: String firstName, lastName,
group. А также double averageMark, содержащую среднюю оценку.

∎
Создать переменную типа Student, которая ссылается на объект
типа Aspirant.

∎ Создать метод getScholarship() для класса Student, который
возвращает сумму стипендии. Если средняя оценка студента равна
5, то сумма 100, иначе 80. Переопределить этот метод в классе
Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200,
иначе 180.

∎ Создать массив типа Student, содержащий объекты класса
Student и Aspirant. Вызвать метод getScholarship() для каждого
элемента массива

 */