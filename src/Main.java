
public class Main {
    public static void main(String[] args) {
        Engine carEngine = new BasicEngine(FuelType.PETROL, 150);
        Car car = new Car("Легковой автомобиль", carEngine);

        Engine bikeEngine = new BasicEngine(FuelType.PETROL, 50);
        Motorcycle motorcycle = new Motorcycle("Мотоцикл", bikeEngine);

        Engine airplaneEngine = new BasicEngine(FuelType.JET_FUEL, 1000);
        Airplane airplane = new Airplane("Самолет", airplaneEngine);

        Engine boatEngine = new BasicEngine(FuelType.DIESEL, 300);
        Boat boat = new Boat("Корабль", boatEngine);
        }
    }

