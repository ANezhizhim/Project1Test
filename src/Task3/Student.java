package Task3;

public class Student {
    protected String firstName, lastName,group;
    double averageMark;
    public Student(double std_averageMark){
        averageMark=std_averageMark;
    }

    public double getScholarship() {
        double Summ;
        if (averageMark==5.0D){
            Summ=100.0D;
        } else Summ=80.0D;

        return Summ;
    }


}
