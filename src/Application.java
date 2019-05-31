public class Application {

    public static void main(String[] args) {
        System.out.println((betCheck(1, 2, 2, 3)));
        drawDiamond(9);
        System.out.println(numberInDegree(10, -3));
    }

    public static double numberInDegree(int number, int degree) {
        if (degree == 0) {
            return 1.0;
        }
        double raiseToPower = 1.0;

        for (int i = 0; i < (degree > 0 ? degree : degree * -1); i++) {
            raiseToPower = raiseToPower * number;
        }
        return degree > 0 ? raiseToPower : 1 / raiseToPower;
    }

    public static Integer betCheck(int firstTeam, int secondTeam, int firstScoreTeamBet, int secondScoreTeamBet) {
        if (firstTeam < 0 || secondTeam < 0 || firstScoreTeamBet < 0 || secondScoreTeamBet < 0) {
            return null;
        }
        return firstTeam == firstScoreTeamBet && secondTeam == secondScoreTeamBet
                ? 2 : ((firstTeam - secondTeam == 0 && firstScoreTeamBet - secondScoreTeamBet == 0)
                || ((firstTeam > secondTeam && firstScoreTeamBet > secondScoreTeamBet) || (secondTeam > firstTeam && secondScoreTeamBet > firstScoreTeamBet)) ? 1 : 0);
    }

    public static void drawDiamond(int size) {
        int empty = size - 1;
        for (int i = 0; i < size; i++) {
            for (int x = 0; x < empty; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < size - empty; y++) {
                System.out.print("* ");
            }
            empty--;
            System.out.println();
        }
        empty = 1;
        for (int i = size - 1; i > 0; i--) {
            for (int x = 0; x < empty; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < size - empty; y++) {
                System.out.print("* ");
            }
            empty++;
            System.out.println();
        }
    }
}
