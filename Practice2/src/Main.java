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
        //polymorfism with the abstract class Staff
        Staff staffer = new Worker(101,"Cashier");
        Staff staffer2 = new Coach(2,"Mike Vrabel",51);
        //methods toString,hashCode and equals
        System.out.println(staffer2.toString());
        System.out.println(staffer.hashCode());
        System.out.println(staffer2.equals(staffer));
    }
}