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

  public void testDiamondOfStar() {

    diamondOfStar(4);
    diamondOfStar(7);
    diamondOfStar(8);
  }

  public void testMathCalculation() {
    System.out.println("X в квадрате:" + mathCalculation(2,2));
    System.out.println("X в кубе:" + mathCalculation(2,3));
    System.out.println("X в степени N:" + mathCalculation(4,5));
    System.out.println("X в отрицательной степени N:" + mathCalculation(2,-2));
    System.out.println("-X в отрицательной степени N:" + mathCalculation(-2,-3));
  }

  private void oneXBet(int firstTeamResult, int secondTeamResult, int predictionOnTheFirstTeam, int predictionOnTheSecondTeam) {

    int checkTotalWinOrDraw = (predictionOnTheFirstTeam == firstTeamResult && predictionOnTheSecondTeam == secondTeamResult) ? 2 :
            ((predictionOnTheFirstTeam - predictionOnTheSecondTeam) - (firstTeamResult - secondTeamResult) == 0) ? 1 : 0;

    int checkOnWinningByAnyTeam = (firstTeamResult > secondTeamResult && predictionOnTheFirstTeam > predictionOnTheSecondTeam) ? 1 :
            (secondTeamResult > firstTeamResult && predictionOnTheSecondTeam > predictionOnTheFirstTeam) ? 1 : 0;

    int profit = (checkTotalWinOrDraw == 2 ^ checkTotalWinOrDraw == 1) ? checkTotalWinOrDraw : checkOnWinningByAnyTeam;
    System.out.println(profit);
  }

  private void diamondOfStar(int maxCountOfStar) {

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
    System.out.println();
  }

  private float mathCalculation(int x, int power) throws IllegalArgumentException {

    float result = 1;
    if (x == 0 && power < 0) { throw new IllegalArgumentException("You probably tried to raise a zero to a negative power."); }

    if (x == 0 && power == 0) return 0;

    if (power < 0) {
      for (int i = 1; i <= -power; i++) {
        result *= x;
      }

      result = 1 / result;
    } else {
      for (int i = 1; i <= power; i++) {
        result *= x;
      }
    }
    return result;
  }
}