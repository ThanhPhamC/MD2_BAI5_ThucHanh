package thuchanh2;

public class Car {
    private String name;
    private String  engine;
    public static int numberofCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofCar++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
}


