package lessonCar;

public class MainCar {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("sedan", "lada", 1.5, 130);
        sedan.signal();
        sedan.move();

        Track truck = new Track("gruzovik", "volvo", 4.8, 110);
        truck.signal();
        truck.move();

        Elektrocar elektrocar = new Elektrocar("kupe", "tesla", 0.0, 280);
        elektrocar.signal();
        elektrocar.move();
    }
}
