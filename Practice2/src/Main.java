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
        StaffMoves.hireStaff();
        Coordinator coordinator = new Coordinator(2,"Defensive coordinator","Jerod Mayo",38);
        StaffMoves.hireStaff();
        Worker worker = new Worker(100,"Cleaning");
        StaffMoves.hireStaff();
        //polymorfism with the abstract class Staff
        Staff staffer = new Worker(101,"Cashier");
        StaffMoves.hireStaff();
        Staff staffer2 = new Coach(2,"Mike Vrabel",51);
        StaffMoves.hireStaff();
        //methods toString,hashCode and equals
        System.out.println(staffer2.toString());
        System.out.println(staffer.hashCode());
        System.out.println(staffer2.equals(staffer));
        headCoach.submitReport();
        headCoach.attendTraining();
        headCoach.takeBreak();
        headCoach.getPromotion();
        headCoach.work();
        headCoach.enrollInsurance();
        headCoach.receiveSalary();
        Intern intern = new Intern(6,120);
        intern.work();
        intern.attendTraining();
        intern.receiveSalary();
        intern.displayInternshipDuration();
        intern.takeBreak();

    }
}