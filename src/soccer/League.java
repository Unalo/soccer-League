package soccer;
import soccer.*;
    public class League {
        public static void main(String[] args) {

           Player player1 = new Player();
           player1.playerName = "unalo";

           Player player2 = new Player();
           player2.playerName = "zola";

           Player player3 = new Player();
           player3.playerName = "Siyasanga";

           Player player4 = new Player();
           player4.playerName = "namelisi";

           Player player5 = new Player();
           player5.playerName = "sne";


           Player[] thePlayers = { player1, player2, player3, player4, player5 };

           Team team1 = new Team();
           team1.teamName = "The Greens";

           team1.playerArray = thePlayers;

           //player1.playerName = "luvo";

//            for (Player thePlayer: team1.playerArray) {
//                System.out.println(thePlayer.playerName);
//            }

            Team team2 = new Team();
            team2.teamName = "The Reds";

            Player player6 = new Player();
            player6.playerName = "Schtoo";

            Player player7 = new Player();
            player7.playerName = "Alakhe";

            Player player8 = new Player();
            player8.playerName = "Luzuko";

            Player player9 = new Player();
            player9.playerName = "lina";

            Player player10 = new Player();
            player10.playerName = "Siyabonga";

            Player[] thePlayers2 = { player6, player7, player8, player9, player10 };

            team2.playerArray = thePlayers2;

//            for (Player thePlayer2: team2.playerArray) {
//                System.out.println(thePlayer2.playerName);
//            }

            Game currGame = new Game();
            currGame.homeTeam = team1;
            currGame.awayTeam = team2;

            Goal goal1 = new Goal();
            goal1.thePlayer = currGame.awayTeam.playerArray[2];
            goal1.theTeam = currGame.awayTeam;
            goal1.theTime = 55;

            Goal goal2 = new Goal();
            goal2.thePlayer = currGame.awayTeam.playerArray[1];
            goal2.theTeam = currGame.awayTeam;
            goal2.theTime = 65;

            Goal goal3 = new Goal();
            goal3.thePlayer = currGame.awayTeam.playerArray[0];
            goal3.theTeam = currGame.awayTeam;
            goal3.theTime = 70;

            Goal goal4 = new Goal();
            goal4.thePlayer = currGame.awayTeam.playerArray[1];
            goal4.theTeam = currGame.awayTeam;
            goal4.theTime = 20;

            Goal goal5 = new Goal();
            goal5.thePlayer = currGame.homeTeam.playerArray[2];
            goal5.theTeam = currGame.homeTeam;
            goal5.theTime = 85;

            Goal[] theGoalsHome = { goal5};
            currGame.goalsHome = theGoalsHome;

            Goal[] theGoalsAway = {goal1, goal2, goal3, goal4};
            currGame.goalsAway = theGoalsAway;

            for (Goal theGoal: currGame.goalsAway) {
                System.out.println("Goal scored after " + theGoal.theTime + " mins by " + theGoal.thePlayer.playerName + " of " + theGoal.theTeam.teamName);
            }

            for (Goal theGoal: currGame.goalsHome ) {
                System.out.println("Goal scored after " + theGoal.theTime + " mins by " + theGoal.thePlayer.playerName + " of " + theGoal.theTeam.teamName);

            }

            System.out.println(theGoalsAway.length > theGoalsHome.length);

            System.out.println( "ITS THE END OF THE GAME \n" + "Game ended with " + theGoalsHome.length + " goal(s) from " + currGame.homeTeam.teamName  + ", and " + theGoalsAway.length + " goal(s) from " + currGame.awayTeam.teamName );

          //  if ( theGoalsHome.length > theGoalsAway.length || theGoalsAway.length > theGoalsHome.length) {
                if (theGoalsHome.length > theGoalsAway.length == true) {
                    System.out.println("Well done to " + currGame.homeTeam.teamName);
                }
                else if (theGoalsAway.length > theGoalsHome.length == true) {
                    System.out.println("Well done to " + currGame.awayTeam.teamName);
                }
            //}

        }
    }
