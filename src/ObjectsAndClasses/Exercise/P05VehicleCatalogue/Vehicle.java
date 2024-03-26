package ObjectsAndClasses.Exercise.P05VehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsePower;

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;

    }

    @Override
    public String toString() {
        String typeVeh = type.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Horsepower: " + horsePower;
    }
}
