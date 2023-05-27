package Registration;

public class EmplWork extends Employee{
    public double TimeRate;
    public int TimeWorked;
    public EmplWork(String name,String id,String designation,double TimeRate,int TimeWorked){
        super(name,id,designation);
        this.TimeRate = TimeRate;
        this.TimeWorked =TimeWorked;
    }
    public double getSalary(int hourlyWorked){
        return TimeRate*hourlyWorked;
    }
    @Override
    public void increaseSalary(double amt) throws InvalidSalaryException{
        if(TimeRate+amt>500)
            throw new InvalidSalaryException("Hourly rate can’t be more than 500");
        TimeRate += amt;
    }
    @Override
    public double getSalary(){
        return TimeRate*TimeWorked;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Rate: "+TimeRate);
    }
}
