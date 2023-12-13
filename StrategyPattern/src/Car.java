public class Car implements StrategyInterface{
    @Override
    public Double calculateTime(int distancia) {
        System.out.println("El tiempo que se tarda el auto en llegar a destino es de : " + distancia / 0.40366 * 4 + " minutos");
        return distancia / 0.40366 * 4;
    }
}
