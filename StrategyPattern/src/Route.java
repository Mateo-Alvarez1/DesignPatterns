public class Route {

    private int startLatitude;
    private int endLatitude;
    private int startLongitude;
    private int endLongitude;


    private StrategyInterface strategyInterface;


    public Route(int startLatitude, int endLatitude, int startLongitude, int endLongitude) {
        this.startLatitude = startLatitude;
        this.endLatitude = endLatitude;
        this.startLongitude = startLongitude;
        this.endLongitude = endLongitude;
        this.strategyInterface = new Walking();
    }

    public void setStrategyInterface(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }

    public int calculateDistance(){
        return Math.abs(startLatitude - endLatitude ) + Math.abs(startLongitude - endLongitude);
    }

    public void calculateTime(int distancia){
        this.strategyInterface.calculateTime(distancia);
    }

}
