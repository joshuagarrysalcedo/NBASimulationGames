import java.util.ArrayList;

public class Team implements Comparable<Team>{
    private String teamName;
    private int wins;
    private int loss;
    private ArrayList<Games> gamesList;

    private double probabilityToShootTwoPoints;
    private double probabilityToShootThreePoints;
    private double abilityToShootTwoPoints;
    private double abilityToSHootThreePoints;


    private int totalThreePointAttempts;
    private int totalThreePointMade;
    private int totalTwoPointAttempts;
    private int totalTwoPointMade;
    private int totalFieldGoalAttempts;
    private int totalFieldGoalMade;
    private double FieldGoalPercent;
    private double threePointFGPercent;
    private double twoPointFGPercent;

    @Override
    public int compareTo(Team t) {
        if(this.wins > t.wins){
            return -1;
        }else if(this.wins == t.wins){
            return 0;
        }else{
            return 1;
        }
    }

    public Team(String teamName, double probabilityToShootThreePoints, double abilityToShootTwoPoints, double abilityToSHootThreePoints) {
        this.teamName = teamName;
        this.probabilityToShootThreePoints = probabilityToShootThreePoints;
        this.abilityToShootTwoPoints = abilityToShootTwoPoints;
        this.abilityToSHootThreePoints = abilityToSHootThreePoints;
        this.probabilityToShootTwoPoints = 100.00 - this.probabilityToShootThreePoints;
        gamesList = new ArrayList<>();
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public void setLoss(int loss) {
        this.loss += loss;
    }

    public void setTotalThreePointAttempts(int totalThreePointAttempts) {
        this.totalThreePointAttempts += totalThreePointAttempts;
    }

    public void setTotalthreePointMade(int totalthreePointMade) {
        this.totalThreePointMade += totalthreePointMade;
    }

    public void setTotalTwoPointAttempts(int totalTwoPointAttempts) {
        this.totalTwoPointAttempts += totalTwoPointAttempts;
    }

    public void setTotalTwoPointMade(int totalTwoPointMade) {
        this.totalTwoPointMade += totalTwoPointMade;
    }

    public void setTotalFieldGoalAttempts(int totalFieldGoalAttempts) {
        this.totalFieldGoalAttempts += totalFieldGoalAttempts;
    }

    public void setTotalFieldGoalMade(int totalFieldGoalMade) {
        this.totalFieldGoalMade += totalFieldGoalMade;
    }
    public void displayStats(){
        System.out.println("------------" + getTeamName() + "------------" );
        System.out.printf("  wins: %5d\t loss: %5d\n", getWins(), getLoss());
        System.out.printf("  FG%%: %10.2f%%\n", getFieldGoalPercent());
        System.out.printf("2-FG%%: %10.2f%%\n", getTwoPointFGPercent());
        System.out.printf("3-FG%%: %10.2f%%\n", getThreePointFGPercent());
    }

    public String getTeamName() {
        return teamName;
    }

    public int getWins() {
        return wins;
    }

    public int getLoss() {
        return loss;
    }

    public ArrayList<Games> getGamesList() {
        return gamesList;
    }

    public double getProbabilityToShootTwoPoints() {
        return probabilityToShootTwoPoints;
    }

    public double getProbabilityToShootThreePoints() {
        return probabilityToShootThreePoints;
    }

    public double getAbilityToShootTwoPoints() {
        return abilityToShootTwoPoints;
    }

    public double getAbilityToSHootThreePoints() {
        return abilityToSHootThreePoints;
    }

    public double getFieldGoalPercent() {
        this.FieldGoalPercent = ((double)getTotalFieldGoalMade()/getTotalFieldGoalAttempts()) * 100;
        return FieldGoalPercent;
    }

    public double getThreePointFGPercent() {
        this.threePointFGPercent = ((double)getTotalthreePointMade()/getTotalThreePointAttempts()) * 100;
        return threePointFGPercent;
    }

    public double getTwoPointFGPercent() {
        this.twoPointFGPercent = ((double)getTotalTwoPointMade()/getTotalTwoPointAttempts()) * 100;
        return twoPointFGPercent;
    }

    public int getTotalThreePointAttempts() {
        return totalThreePointAttempts;
    }

    public int getTotalthreePointMade() {
        return totalThreePointMade;
    }

    public int getTotalTwoPointAttempts() {
        return totalTwoPointAttempts;
    }

    public int getTotalTwoPointMade() {
        return totalTwoPointMade;
    }

    public int getTotalFieldGoalAttempts() {
        return totalFieldGoalAttempts;
    }

    public int getTotalFieldGoalMade() {
        return totalFieldGoalMade;
    }
}



