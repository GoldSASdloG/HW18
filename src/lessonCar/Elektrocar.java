package lessonCar;

public class Elektrocar extends Car{

    public Elektrocar() {
    }

    public Elektrocar(String bodyCar, String marka, Double engenVolume, Integer maxSpeed) {
        super(bodyCar, marka, engenVolume, maxSpeed);
    }

    public void move(){
        System.out.println("Elektrocar edet so skorostiu: " + maxSpeed + "Km");
    }
}
