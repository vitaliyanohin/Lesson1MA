public class Tasks {

  public void testOneXBet() {

    oneXBet(2, 0, 2, 0);
    oneXBet(0, 2, 0, 3);
    oneXBet(2, 0, 2, 3);
    oneXBet(2, 2, 2, 2);
    oneXBet(2, 2, 4, 2);
    oneXBet(2, 2, 3, 3);
    oneXBet(2, 2, 1, 1);

  }

  public void testRhombusOfStar() {
    System.out.println();
    rhombusOfStar(4);
    System.out.println();
    rhombusOfStar(7);
    System.out.println();
    rhombusOfStar(8);
  }

  public void testMathOperations() {
    System.out.println("X в квадрате:" + mathOperations(2,2));
    System.out.println("X в кубе:" + mathOperations(2,3));
    System.out.println("X в степени N:" + mathOperations(4,5));
    System.out.println("X в отрицательной степени N:" + mathOperations(2,-2));
    System.out.println("-X в отрицательной степени N:" + mathOperations(-2,-3));
  }

  private void oneXBet(int firstTeamResult, int secondTeamResult, int predictionOnTheFirstTeam, int predictionOnTheSecondTeam) {

    int checkTotalWinOrDraw = (predictionOnTheFirstTeam == firstTeamResult && predictionOnTheSecondTeam == secondTeamResult) ? 2 :
            ((predictionOnTheFirstTeam - predictionOnTheSecondTeam) - (firstTeamResult - secondTeamResult) == 0) ? 1 : 0;

    int checkOnWinningByAnyTeam = (firstTeamResult > secondTeamResult && predictionOnTheFirstTeam > predictionOnTheSecondTeam) ? 1 :
            (secondTeamResult > firstTeamResult && predictionOnTheSecondTeam > predictionOnTheFirstTeam) ? 1 : 0;

    int profit = (checkTotalWinOrDraw == 2 ^ checkTotalWinOrDraw == 1) ? checkTotalWinOrDraw : checkOnWinningByAnyTeam;
    System.out.println(profit);
  }

  private void rhombusOfStar(int maxCountOfStar) {

    StringBuilder stringBuilder = new StringBuilder("");

    for (int i = 0; i < maxCountOfStar; i++) {
      int c = 0;
      //Предупреждение! Сейчас будет твориться магия!)
      while (c < maxCountOfStar - i) {
        System.out.print(" ");
        c++;
      }
      stringBuilder.append(" *");

      System.out.println(stringBuilder);
    }
    for (int k = maxCountOfStar - 1; k > 0; k--) {
      int c = 0;
      //Предупреждение! Сейчас будет твориться магия!)
      while (c < (maxCountOfStar + 1) - k) {
        System.out.print(" ");
        c++;
      }

      stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("*"));
      System.out.println(stringBuilder);
    }
  }

  private float mathOperations(int x, int degree) throws IllegalArgumentException {

    float result = 1;
    if (x == 0 && degree < 0) { throw new IllegalArgumentException("You probably tried to raise a zero to a negative degree."); }

    if (x == 0 && degree == 0) return 0;

    if (degree < 0) {
      for (int i = 1; i <= -degree; i++) {
        result *= x;
      }

      result = 1 / result;
    } else {
      for (int i = 1; i <= degree; i++) {
        result *= x;
      }
    }

    return result;
  }
}


