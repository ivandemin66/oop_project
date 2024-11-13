public final class Boat extends Vehicle {
    public Boat(String name, Engine engine) {
        super(name, engine);
    }

    @Override
    public void move() {
        System.out.println(name + " плывет по воде.");
    }

    @Override
    public void stop() {
        System.out.println(name + " остановился в воде.");
    }
}
