import java.util.ArrayList;

public class League <T extends  Team> {
    private String leagueName;
    private ArrayList<T> teamList;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teamList = new ArrayList<>();
    }

    public void DisplayRankings() {
        for (int i = 0; i < teamList.size(); i++) {
            //  System.out.printf("%s\t%5d\t%5d%\t%.2f%%\t%.2f%%%.2f%%", teamList.get(i).getName(), teamList.get(i).getName());
        }
    }

    public String getLeagueName() {
        return leagueName;
    }

    public ArrayList<T> getTeamList() {
        return teamList;
    }
}

