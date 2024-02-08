package lessonCar;

public class Sedan extends Car {

    public Sedan() {
    }

    public Sedan(String bodyCar, String marka, double engenVolume, Integer maxSpeed) {
        super(bodyCar, marka, engenVolume, maxSpeed);
    }

    public void move(){
        System.out.println("sedan edet so skorostiu: " + maxSpeed + "Km");
    }
}
