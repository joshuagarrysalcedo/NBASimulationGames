public class Participants {
    Team participant;
    private int Score;
    private int FieldGoalAttempts;
    private int FieldGoalMade;
    private double FieldGoalPercent;
    private int twoPointAttempts;
    private int twoPointMade;
    private double twoPointFieldGoalPercent;
    private int threePointAttempts;
    private int threePointMade;
    private double ThreePointFieldGoalPercent;

    private boolean winner = false;

    public Participants(Team participant) {
        this.participant = participant;
        this.Score = 0;
        this.FieldGoalAttempts = 0;
        this.FieldGoalMade = 0;
        this.FieldGoalPercent = 0;
        this.twoPointAttempts = 0;
        this.twoPointMade = 0;
        this.twoPointFieldGoalPercent = 0;
        this.threePointAttempts = 0;
        this.threePointMade = 0;
        this.ThreePointFieldGoalPercent = 0;
    }

    public Team getParticipant() {
        return participant;
    }

    public void setScore(int score) {
        Score += score;
    }

    public void setFieldGoalAttempts(int fieldGoalAttempts) {
        FieldGoalAttempts += fieldGoalAttempts;
    }

    public void setFieldGoalMade(int fieldGoalMade) {
        FieldGoalMade += fieldGoalMade;
    }

    public void setTwoPointAttempts(int twoPointAttempts) {
        this.twoPointAttempts += twoPointAttempts;
    }

    public void setTwoPointMade(int twoPointMade) {
        this.twoPointMade += twoPointMade;
        setFieldGoalMade(1);
    }

    public void setThreePointAttempts(int threePointAttempts) {
        this.threePointAttempts += threePointAttempts;
    }

    public void setThreePointMade(int threePointMade) {
        this.threePointMade += threePointMade;
        setFieldGoalMade(1);
    }

    public int getScore() {
        return Score;
    }

    public int getFieldGoalAttempts() {
        return FieldGoalAttempts;
    }

    public int getFieldGoalMade() {
        return FieldGoalMade;
    }

    public double getFieldGoalPercent() {
        this.FieldGoalPercent = ((double)getFieldGoalMade() / getFieldGoalAttempts()) * 100;
        return FieldGoalPercent;
    }

    public int getTwoPointAttempts() {
        return twoPointAttempts;
    }

    public int getTwoPointMade() {
        return twoPointMade;
    }

    public double getTwoPointFieldGoalPercent() {
        this.twoPointFieldGoalPercent = ((double)getTwoPointMade()/getTwoPointAttempts()) * 100;
        return twoPointFieldGoalPercent;
    }

    public int getThreePointAttempts() {
        return threePointAttempts;
    }

    public int getThreePointMade() {
        return threePointMade;
    }

    public double getThreePointFieldGoalPercent() {
        this.ThreePointFieldGoalPercent = ((double)getThreePointMade()/getThreePointAttempts()) * 100;
        return ThreePointFieldGoalPercent;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
