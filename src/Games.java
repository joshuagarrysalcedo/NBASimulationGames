import java.util.Random;

public class Games {
    private Participants team1;
    private Participants team2;
    private int possessions;
    private Random ran = new Random();
    public Games(Participants team1, Participants team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.possessions = 140; // a total of 140 possessions per game is simulated not the time
    }

        public void SimulateGame(){
                for(int i = 0; i < possessions; i++){
                    if((i / 2) == 0){ // means this is even.
                            shotAttempt(team1);
                    }else{
                            shotAttempt(team2);
                    }
                }
        while(team1.getScore() == team2.getScore()){
                    int attempt = ran.nextInt(2) + 1;
                        if(attempt == 1)
                            shotAttempt(team1);
                        else
                            shotAttempt(team2);
            }

        if(team1.getScore() > team2.getScore()){
            team1.setWinner(true);
            System.out.println(team1.getParticipant().getTeamName() + " won against " + team2.getParticipant().getTeamName());
        }
            else{
            team2.setWinner(true);
            System.out.println(team1.getParticipant().getTeamName() + " lost against " + team2.getParticipant().getTeamName());
        }
            updateStats(team1);
            updateStats(team2);

        }

        public void shotAttempt(Participants team){
            int typeOfAttempt = ran.nextInt(100) + 1;
            team.setFieldGoalAttempts(1);
            if(typeOfAttempt <= team.getParticipant().getProbabilityToShootThreePoints()){
                team.setThreePointAttempts(1); // add one three point attempt.
                    int attempt = ran.nextInt(100) + 1;
                    if(attempt <= Math.ceil(team.getParticipant().getAbilityToSHootThreePoints())){
                        team.setThreePointMade(1); // made a three point
                        team.setScore(3);
                    }
            }else{
                team.setTwoPointAttempts(1);
                    int attempt = ran.nextInt(100) + 1;
                    if(attempt <= team.getParticipant().getAbilityToShootTwoPoints()){
                        team.setTwoPointMade(1);
                        team.setScore(2);
                    }
            }
        }

        public void updateStats(Participants team){
            if(team.isWinner()){
                team.getParticipant().setWins(1);
            }else{
                team.getParticipant().setLoss(1);
            }

            team.getParticipant().setTotalFieldGoalAttempts(team.getFieldGoalAttempts());
            team.getParticipant().setTotalFieldGoalMade(team.getFieldGoalMade());
            team.getParticipant().setTotalThreePointAttempts(team.getThreePointAttempts());
            team.getParticipant().setTotalthreePointMade(team.getThreePointMade());
            team.getParticipant().setTotalTwoPointAttempts(team.getTwoPointAttempts());
            team.getParticipant().setTotalTwoPointMade(team.getTwoPointMade());
        }

        public void displayBoxScore(){
            System.out.printf("Teams: %15s\t%15s\n", team1.getParticipant().getTeamName(), team2.getParticipant().getTeamName());
            System.out.printf("Score: %15d\t%15d\n", team1.getScore(), team2.getScore());
            System.out.printf("  FG: %15d/%d\t%15d/%d", team1.getFieldGoalMade(), team1.getFieldGoalAttempts(), team2.getFieldGoalMade(), team2.getFieldGoalAttempts());
            System.out.printf(" FG%%: %18.2f%%\t%18.2f%%", team1.getFieldGoalPercent(), team2.getFieldGoalPercent());
            System.out.printf("2-FG: %15d/%d\t%15d/%d", team1.getTwoPointMade(), team1.getTwoPointAttempts(), team2.getTwoPointMade(), team2.getTwoPointAttempts());
            System.out.printf("2-FG%%: %18.2f%%\t%18.2f%%", team1.getTwoPointFieldGoalPercent(), team2.getTwoPointFieldGoalPercent());
        }



}
