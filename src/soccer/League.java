package soccer;
import soccer.*;
    public class League {
        public static void main(String[] args) {

           Player goalKeeper = new Player();
           goalKeeper.playerName = "Khuzwayo";

           Player RightCenterBack = new Player();
           RightCenterBack.playerName = "Happy Jele";

           Player LeftCenterBack = new Player();
           LeftCenterBack.playerName = "Innocent Maela";

           Player centerMid  = new Player();
           centerMid.playerName = "Musa Nyatama";

           Player CenterMid = new Player();
           CenterMid.playerName = "Mutswari";

           Player striker = new Player();
           striker.playerName = "Mulenga";

           Player[] thePlayers = { goalKeeper, RightCenterBack, LeftCenterBack, centerMid, CenterMid, striker };

           Team team1 = new Team();
           team1.teamName = "Orlando Pirates";

           team1.playerArray = thePlayers;

           //player1.playerName = "luvo";

//            for (Player thePlayer: team1.playerArray) {
//                System.out.println(thePlayer.playerName);
//            }

            Team team2 = new Team();
            team2.teamName = "Kaizer Chiefs";

            Player goalKeeper2 = new Player();
            goalKeeper.playerName = "Akpeyi";

            Player centreBack = new Player();
            centreBack.playerName = "Gordinho";

            Player rightBack = new Player();
            rightBack.playerName = "Mpahlele";

            Player centerMid2 = new Player();
            centerMid.playerName = "Katsande";

            Player leftWing = new Player();
            leftWing.playerName = "Zulu";

            Player striker2 = new Player();
            striker.playerName = "Billite";

            Player[] thePlayers2 = { goalKeeper2 , centreBack, rightBack, centerMid2, leftWing, striker2 };

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
            goal2.thePlayer = currGame.awayTeam.playerArray[4];
            goal2.theTeam = currGame.awayTeam;
            goal2.theTime = 65;

            Goal goal3 = new Goal();
            goal3.thePlayer = currGame.awayTeam.playerArray[1];
            goal3.theTeam = currGame.awayTeam;
            goal3.theTime = 70;

            Goal goal4 = new Goal();
            goal4.thePlayer = currGame.awayTeam.playerArray[4];
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
