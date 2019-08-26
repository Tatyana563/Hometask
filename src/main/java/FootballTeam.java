import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FootballTeam {
    String name;

    public FootballTeam(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                '}';
    }
    public void findTheBestTeam(List<Footballer> listOfPlayers){
        int maxScore=0;
Footballer footballer=new Footballer("f101",101,0,0,0);
        int maxScoreGame1=0;
        for(int i=0;i<listOfPlayers.size();i++){

            int playerScoresForAllGamees = listOfPlayers.get(i).score1+
            listOfPlayers.get(i).score2+
            listOfPlayers.get(i).score3;

            if(playerScoresForAllGamees>maxScore){
                maxScore=playerScoresForAllGamees;
footballer=listOfPlayers.get(i);
            }


        }
        System.out.println("The best palyer"+ footballer);
        System.out.println("The best palyer's scores:"+ maxScore);

        for(int i=0;i<listOfPlayers.size();i++){
           if(listOfPlayers.get(i).score1>maxScoreGame1){
               maxScoreGame1=listOfPlayers.get(i).score1;
               footballer=listOfPlayers.get(i);
           }

        }
        System.out.println("The best palyer's score Game1"+maxScoreGame1);
        System.out.println("the best player Game1" + footballer);




        List<Footballer> mainTeam = new ArrayList<>();
        List<Footballer> substituteTeam = new ArrayList<>();
    for(int i=0;i<listOfPlayers.size();i++){
        if(listOfPlayers.get(i).number%2==0){
            mainTeam.add(listOfPlayers.get(i));
        }
        else{
            substituteTeam.add(listOfPlayers.get(i));
        }
    }
        System.out.println("Main team:"+ mainTeam);
        System.out.println("substituteTeam:"+substituteTeam);
        int scoreMainTeamGame1=0;
        int scoreMainTeamGame2=0;
        int scoreMainTeamGame3=0;

        int scoresubstituteTeamGame1=0;
        int scoresubstituteTeamGame2=0;
        int scoresubstituteTeamGame3=0;


        for(int i=0;i<mainTeam.size();i++) {

            scoreMainTeamGame1 = scoreMainTeamGame1 + mainTeam.get(i).score1;
            scoreMainTeamGame2 = scoreMainTeamGame2 + mainTeam.get(i).score2;
            scoreMainTeamGame3 = scoreMainTeamGame3 + mainTeam.get(i).score3;
        }
        for(int i=0;i<substituteTeam.size();i++) {
            scoresubstituteTeamGame1 = scoresubstituteTeamGame1 + substituteTeam.get(i).score1;
            scoresubstituteTeamGame2 = scoresubstituteTeamGame2 + substituteTeam.get(i).score2;
            scoresubstituteTeamGame3 = scoresubstituteTeamGame3 + substituteTeam.get(i).score3;
        }
        System.out.println("Scores of main team game1:"+ scoreMainTeamGame1);
        System.out.println("Scores of main team game2:"+ scoreMainTeamGame2);
        System.out.println("Scores of main team game3:"+ scoreMainTeamGame3);

        System.out.println("Scores of substitute team game1:"+scoresubstituteTeamGame1);
        System.out.println("Scores of substitute team game2:"+scoresubstituteTeamGame2);
        System.out.println("Scores of substitute team game3:"+scoresubstituteTeamGame3);
        int difference=0;
        difference=(scoreMainTeamGame1+scoreMainTeamGame2+scoreMainTeamGame3)-(scoresubstituteTeamGame1+scoresubstituteTeamGame2+scoresubstituteTeamGame3);
        // Difference between main and sub teams in scores
        System.out.println(difference);
    }

    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam("Liverpool");
        Footballer f1 = new Footballer("f1",2,1,1,2);
        Footballer f2 = new Footballer("f2",6,1,1,2);
        Footballer f3 = new Footballer("f3",22,0,0,2);
        Footballer f4 = new Footballer("f4",8,5,1,0);
        Footballer f5 = new Footballer("f5",10,1,1,2);
        Footballer f6 = new Footballer("f6",3,1,1,0);
        Footballer f7 = new Footballer("f7",7,4,3,2);
        Footballer f8 = new Footballer("f8",9,0,1,2);
        Footballer f9 = new Footballer("f9",11,0,0,0);
        Footballer f10 = new Footballer("f10",13,0,0,2);
        List<Footballer> footballers = new ArrayList<>();
        Collections.addAll(footballers,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10);
        footballTeam.findTheBestTeam(footballers);
    }

}
class Footballer{
    String name;
   int number;
    int score1;
    int score2;
    int score3;

    public Footballer(String name, int number, int score1, int score2, int score3) {
        this.name = name;
        this.number = number;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                '}';
    }
}
