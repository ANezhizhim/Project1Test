package Task1;

public class Phone {
    String number;
    String model;
    float weight;

    public  Phone(String ph_number, String ph_model, float ph_weight){

     this("8-800","Стационарный");

        this.number=ph_number;
        this.model=ph_model;
        this.weight=ph_weight;

    }
    public  Phone(String ph_number, String ph_model){
        this.number=ph_number;
        this.model=ph_model;
    }
    public  Phone(){

    }


    public void receiveCall(String Name){
        System.out.println("Звонит: " + Name);
    }

    public void receiveCall(String Name,String Number){
        System.out.println("Звонит: " + Name+", Номер: "+ Number);
    }
    public String getNumber(){
        return number;

       // System.out.println("Номер : " + number);
    }
   public void sendMessage1(String ... numbers1){

       for(int i=0; i<numbers1.length;i++) {
           System.out.println("Номер : " + numbers1[i]);
       }
   }
}
