package Praktica.Praktica1;

public class Cargo_Track extends Car{
    public Cargo_Track(String mark, String model, int years) {
        super(mark, model, years);
    }

    @Override
    public String toString() {
        return "Car:" + mark +" "+ model +" "+ years;
    }
}
