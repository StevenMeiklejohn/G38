public class Motorbike extends Vehicle {

    public Motorbike(String model)
    {
        super(model, 2);
    }

    public String drivingInstructions()
    {
        return super.drivingInstructions() + " Use handlebars to steer.";

    }

    @Override
    public String boardingInstructions() {
        return "get on the bike";
    }
}