public class Main {
    private static League<Team> nba = new League<>("National BasketBall Association");
    private static final int NUMBER_OF_GAMES = 82;
    public static void main(String[] args) {

        Team lakers = new Team("Lakers", 35.5,49, 38.1);
        Team celtics = new Team("Celtics", 40, 47, 38.1);
        Team hawks = new Team("Hawks", 40, 44.8, 35.9);
        Team nets = new Team("Nets", 42, 49.6, 39.5);
        nba.getTeamList().add(lakers);
        nba.getTeamList().add(celtics);
        nba.getTeamList().add(hawks);
        nba.getTeamList().add(nets);

//        lakers.getGamesList().add(new Games(new Participants(lakers),new Participants(celtics)));
//        lakers.getGamesList().get(0).SimulateGame();
//        lakers.getGamesList().get(0).displayBoxScore();
//
//        lakers.getGamesList().add(new Games(new Participants(lakers),new Participants(celtics)));
//        lakers.getGamesList().get(1).SimulateGame();
//        lakers.getGamesList().get(1).displayBoxScore();
//
//
//        lakers.getGamesList().add(new Games(new Participants(lakers),new Participants(celtics)));
//        lakers.getGamesList().get(2).SimulateGame();
//        lakers.getGamesList().get(2).displayBoxScore();
//        lakers.displayStats();
//        celtics.displayStats();
        simulateGames();
        nba.displayTeams();

    }

    public static void simulateGames(){
        for(int i = 0; i < nba.getTeamList().size(); i++){
            while(nba.getTeamList().get(i).getGamesList().size() < NUMBER_OF_GAMES){
                for(int y = 0; y < nba.getTeamList().size(); y++){
                    if(nba.getTeamList().get(i) != nba.getTeamList().get(y)){
                        System.out.println("Playing game number " + nba.getTeamList().get(i).getGamesList().size());
                        nba.getTeamList().get(i).getGamesList().add(new Games(new Participants(nba.getTeamList().get(i)), new Participants(nba.getTeamList().get(y))));

                    }
                }
            }//while loop
        }
    }
}
