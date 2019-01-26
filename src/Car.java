public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double speed;

    public Car(){
        this.make = "Ford";
        this.model = "Mustang";
        this.year = 2019;
        this.color = "black";
        this.setSpeed(0);
    }

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.setSpeed(0);
    }


    public String getMake(){
        return make;
    }

    public void setMake(String _make){
        make = _make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(double speed){
        this.setSpeed(speed);
    }

    public void stop(){
        this.setSpeed(0);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
