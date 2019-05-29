public class Tasks {

  public void testPredictionOfMatchResult() {
    predictionOfMatchResult(2, 0, 2, 0);
    predictionOfMatchResult(0, 2, 0, 3);
    predictionOfMatchResult(2, 0, 2, 3);
    predictionOfMatchResult(2, 2, 3, 2);
    predictionOfMatchResult(2, 2, 4, 2);
    predictionOfMatchResult(2, 2, 3, 3);
    predictionOfMatchResult(2, 2, 1, 1);
  }

  public void testDiamondOfStar() {
    diamondOfStar(4);
    diamondOfStar(7);
    diamondOfStar(8);
  }

  public void testMathCalculation() {
    System.out.println("X в квадрате:" + mathCalculation(2, 2));
    System.out.println("X в кубе:" + mathCalculation(2, 3));
    System.out.println("X в степени N:" + mathCalculation(4, 5));
    System.out.println("X в отрицательной степени N:" + mathCalculation(2, -2));
    System.out.println("-X в отрицательной степени N:" + mathCalculation(-2, -3));
  }

  private void predictionOfMatchResult(int firstTeamResult, int secondTeamResult,
                                       int predictionOnTheFirstTeam, int predictionOnTheSecondTeam) {
    int profit = (predictionOnTheFirstTeam == firstTeamResult && predictionOnTheSecondTeam == secondTeamResult) ? 2 :
            (firstTeamResult > predictionOnTheFirstTeam && secondTeamResult > predictionOnTheSecondTeam) ||
                    (firstTeamResult < predictionOnTheFirstTeam && secondTeamResult < predictionOnTheSecondTeam) ||
                    (firstTeamResult == predictionOnTheFirstTeam && secondTeamResult == predictionOnTheSecondTeam) ? 1 : 0;

    System.out.println(profit);
  }

  private void diamondOfStar(int maxCountOfStar) {
    StringBuilder stringBuilder = new StringBuilder("");
    for (int i = 0; i < maxCountOfStar; i++) {
      int variableForIteration = 0;
      while (variableForIteration < maxCountOfStar - i) {
        System.out.print(" ");
        variableForIteration++;
      }

      stringBuilder.append(" *");
      System.out.println(stringBuilder);
    }
    for (int k = maxCountOfStar - 1; k > 0; k--) {
      int variableForIteration = 0;
      while (variableForIteration < (maxCountOfStar + 1) - k) {
        System.out.print(" ");
        variableForIteration++;
      }

      stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("*"));
      System.out.println(stringBuilder);
    }
  }

  private float mathCalculation(int number, int power) throws IllegalArgumentException {
    float result = 1;
    if (number == 0 && power < 0) {
      throw new IllegalArgumentException("You probably tried to raise a zero to a negative power.");
    }
    if (number == 0 && power == 0) {
      return 0;
    }
    if (power < 0) {
      for (int i = power; i < 0; i++) {
        result *= number;
      }
      result = 1 / result;
    } else {
      for (int i = 1; i <= power; i++) {
        result *= number;
      }
    }
    return result;
  }
}
