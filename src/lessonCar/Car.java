package lessonCar;


public abstract class Car {
    protected String bodyCar;
    protected String marka;
    protected double engenVolume;
    protected Integer maxSpeed;

    public Car() {
    }

    public Car(String bodyCar, String marka, double engenVolume, Integer maxSpeed) {
        this.bodyCar = bodyCar;
        this.marka = marka;
        this.engenVolume = engenVolume;
        this.maxSpeed = maxSpeed;
    }

    public String getBodyCar() {
        return bodyCar;
    }

    public void setBodyCar(String bodyCar) {
        this.bodyCar = bodyCar;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getEngenVolume() {
        return engenVolume;
    }

    public void setEngenVolume(double engenVolume) {
        this.engenVolume = engenVolume;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void signal(){
        System.out.println("be-be-be");
    }

}
