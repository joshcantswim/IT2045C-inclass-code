public class Program {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("myCar Make " + myCar.getMake());
        System.out.println("myCar Model " + myCar.getModel());
        System.out.println("myCar Year " + myCar.getYear());
        System.out.println("myCar Color " + myCar.getColor());
        System.out.println("myCar Speed " + myCar.getSpeed());

        Car car2 = new Car("Honda", "Accord", 2019, "Silver");

        System.out.println("myCar Make " + myCar.getMake());
        System.out.println("myCar Model " + myCar.getModel());
        System.out.println("myCar Year " + myCar.getYear());
        System.out.println("myCar Color " + myCar.getColor());
        System.out.println("myCar Speed " + myCar.getSpeed());

        car2.move(65);
        System.out.println("car2 speed = " + car2.getSpeed());


    }
}
