public class Main {
    public static void main(String[] args) {

        GameCalculator[] gameCalculators = new GameCalculator[]{new WomanGameCalculator(),new KidGameCalculator(),new ManGameCalculator()};

        for (GameCalculator gameCalculator: gameCalculators){
            gameCalculator.calculate();
        }
    }
}