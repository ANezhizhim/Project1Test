package Task3;

public class Aspirant extends Student {
    protected String dissertationTopic;
    //double averageMark;

   public Aspirant (double asp_averageMark, String asp_dissertationTopic){
        super(asp_averageMark);
        this.dissertationTopic=asp_dissertationTopic;

}
   @Override
    public double getScholarship() {
        double Summ;
        if (averageMark==5.0D){
            Summ=200.0D;
        } else Summ=180.0D;

        return Summ;

    }
}
