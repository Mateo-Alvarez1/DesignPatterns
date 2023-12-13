public class Bike implements StrategyInterface {
    @Override
    public Double calculateTime(int distancia) {
        System.out.println("El tiempo que se tarda el auto en llegar a destino es de : " + distancia / 0.050366 * 1.5+ " minutos");
        return distancia / 0.050366 * 1.5;
    }
}
