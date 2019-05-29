public class Application {

  public static void main(String[] args) {
    Tasks tasks = new Tasks();
    tasks.testPredictionOfMatchResult();
    System.out.println("Next:");
    tasks.testMathCalculation();
    System.out.println("Next:");
    tasks.testDiamondOfStar();
  }
}
