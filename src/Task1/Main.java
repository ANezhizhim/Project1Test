package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phone arrPhone[] = new Phone[4];


        arrPhone[ 0] =new Phone("9155476161", "Honor", 120.1f);
        arrPhone[ 1] =new Phone("9155476162", "Samsung", 125.2f);
         arrPhone[ 2]=new Phone("9155476163", "HTC", 127.3f);
        arrPhone[ 3] =new Phone("9155476165", "Nokia");

        arrPhone[0].receiveCall("Вася");
        for (Phone phon :
                arrPhone) {
            System.out.println("Номер телефона: " + phon.number + " модель: " + phon.model + " Вес: " + phon.weight);

        }

        // System.out.println("Номер телефона: " + Phone1.number + " модель: "+Phone1.model + " Вес: "+Phone1.weight);
        // System.out.println("Номер телефона: " + Phone2.number + " модель: "+Phone2.model + " Вес: "+Phone2.weight);
        // System.out.println("Номер телефона: " + Phone3.number + " модель: "+Phone3.model + " Вес: "+Phone3.weight);
        for (Phone phon :
                arrPhone) {
            System.out.println("Номер телефона:" + phon.getNumber());
        }
  /*  System.out.println("Номер телефона:" + Phone1.getNumber());
    System.out.println("Номер телефона:" + Phone2.getNumber());
    System.out.println("Номер телефона:" + Phone3.getNumber());
    System.out.println("Номер телефона:" + Phone4.getNumber());
*/


        //    Phone1.receiveCall("Давид Маркович","Городской");
        // Phone1.sendMessage1("9155476161","9155476162","9155476163");
        arrPhone[0].receiveCall("Давид Маркович", "Городской");
        arrPhone[0].sendMessage1("9155476161", "9155476162", "9155476163");


    }
}
