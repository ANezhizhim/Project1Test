package Task1;

public class Phone {
    protected String number;
    protected String model;
    protected float weight;

    public Phone(String phNumber, String phModel, float phWeight) {
        this.number = phNumber;
        this.model = phModel;
        this.weight = phWeight;
    }

    public Phone(String phNumber, String phModel) {
        this.number = phNumber;
        this.model = phModel;
    }

    public Phone() {
        this("8-800", "Стационарный");
    }


    public void receiveCall(String Name) {
        System.out.println("Звонит: " + Name);
    }

    public void receiveCall(String Name, String Number) {
        System.out.println("Звонит: " + Name + ", Номер: " + Number);
    }

    public String getNumber() {
        return number;

        // System.out.println("Номер : " + number);
    }

    public void sendMessage1(String... numbers1) {

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Номер : " + numbers1[i]);
        }
    }
}
