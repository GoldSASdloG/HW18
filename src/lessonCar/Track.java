package lessonCar;

public class Track extends Car{

    public Track() {
    }

    public Track(String bodyCar, String marka, double engenVolume, Integer maxSpeed) {
        super(bodyCar, marka, engenVolume, maxSpeed);
    }

    public void move(){
        System.out.println("Truck edet so skorostiu: " + maxSpeed + "Km");
    }
}
