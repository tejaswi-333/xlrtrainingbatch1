package PS003;

public class Bowler {
    String name;
    int wicket;
    int matches;
    int balls_bowled;
    int runs_conceded;

    Bowler() {
        this.name=" ";
        this.wicket=0;
        this .matches=0;
        this.balls_bowled=0;
        this.runs_conceded=0;
    }

    Bowler(String name, int wicket, int matches, int balls_bowled, int runs_conceded){
        this.name=name;
        this.wicket=wicket;
        this.matches=matches;
        this.balls_bowled=balls_bowled;
        this.runs_conceded=runs_conceded;
    }

    public void computeBowlingAverage(){
        double avg = (double)runs_conceded / wicket;
        System.out.println("Bowling Avg: "+ avg);
    }

    public void showStatistics(){
        System.out.println("Name: "+name);
        System.out.println("Wickets: "+wicket);
        System.out.println("Matches: "+matches);
        System.out.println("Balls bowled: "+balls_bowled);
        System.out.println("Runs conceded: "+runs_conceded);
    }
    public void computeStrikeRate() {
        double sr = (double)runs_conceded / balls_bowled;
        System.out.println("Name: "+name);
        System.out.printf("Strike rate: %.8f\n",sr);
    }

    public static void main(String[] args) {
        
        Bowler b1= new Bowler("Sachin", 10, 5, 750, 463);
        b1.computeBowlingAverage();
        b1.showStatistics();
        b1.computeStrikeRate();
    }

}
