public class Main {
    public static void main(String[] args) {

        Route route = new Route(10 , 50 , 30 , 40);
        var distance = route.calculateDistance();

        route.calculateTime(distance);

        //car
        route.setStrategyInterface(new Car());
        route.calculateTime(distance);

        //Bike
        route.setStrategyInterface(new Bike());
        route.calculateTime(distance);
    }
}
