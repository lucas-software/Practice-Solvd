//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nba nba = new Nba(1,"Basketball",32);
        Nfl nfl = new Nfl(2,"Football");
        NbaTeam nbaTeam = new NbaTeam("Brazillian Angels",Conference.NORTH,1);
        NflTeam nflTeam = new NflTeam("Brazillian Devils",Conference.SOUTH,2);
        Player Neymar = new Player(11,"Brazil","Forward");
        Coach headCoach = new Coach(1,"Bill Belichick",72);
        Coordinator coordinator = new Coordinator(2,"Defensive coordinator","Jerod Mayo",38);
        Worker worker = new Worker(100,"Cleaning");
    }
}