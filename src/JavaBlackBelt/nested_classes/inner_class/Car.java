package JavaBlackBelt.nested_classes.inner_class;

public class Car {
    String color;
    private int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
//        Engine e = new Engine(150);
//        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        private int horsePower;

        public Engine(int horsePower) {
            System.out.println(doorCount);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
//        Car.Engine engine = new Car.Engine(256);
//        System.out.println(engine);
//        Car car = new Car("black",4,300);
        Car car = new Car("Black", 4);
        Car.Engine engine = car.new Engine(150);
        System.out.println(engine);
        car.setEngine(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("Yellow", 4)
                .new Engine(200);

//        Car.Engine engine2 = new car.Engine(150);



    }
}