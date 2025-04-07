class CarModel {
    private String title;

    public CarModel(String title) {
        this.title = title;
    }

    public void operation() {
        System.out.println("Model: " + title);
    }
}

class GearBoxType {
    private String name;
    private String remarks;
}

class GearBox {
    private float[] gearRatio;
    private int currentGear;

    public void shiftUp() {
        currentGear++;
        System.out.println("Gear shifted up to: " + currentGear);
    }

    public void shiftDown() {
        currentGear--;
        System.out.println("Gear shifted down to: " + currentGear);
    }
}

class Suspension {
    private float springRate;
}

class Tire {
    private float width;
    private float airPressure;
}

class Wheel {
    private float diameter;
    private Tire tire;
}

class Brake {
    private String type;

    public void apply() {
        System.out.println("Brake applied");
    }
}

class Engine {
    private float capacity;
    private int numberOfCylinders;

    public void start() {
        System.out.println("Engine started");
    }

    public void brake() {
        System.out.println("Engine braking");
    }

    public void accelerate() {
        System.out.println("Engine accelerating");
    }
}

class Body {
    private int numberOfDoors;
}

class Car {
    private String registrationNum;
    private int year;
    private String licenseNumber;
    GearBox gearBox = new GearBox();
    CarModel carModel = new CarModel("Toyota");
    Brake brake = new Brake();
    Engine engine = new Engine();

    public void moveForward() {
        System.out.println("Car moving forward");
    }

    public void moveBackward() {
        System.out.println("Car moving backward");
    }

    public void stop() {
        System.out.println("Car stopped");
        brake.apply();
    }

    public void turnRight() {
        System.out.println("Car turning right");
    }

    public void turnLeft() {
        System.out.println("Car turning left");
    }
}

public class FikriArmiaFahmi_2023071018_LatPertem4 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.carModel.operation();
        myCar.engine.start();
        myCar.moveForward();
        myCar.moveBackward();
        myCar.gearBox.shiftUp();
        myCar.turnLeft();
        myCar.turnRight();
        myCar.stop();
    }
}
