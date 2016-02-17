public class TennisGame2 implements TennisGame
{
    public int player1points = 0;
    public int player2points = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    
    private String sameScore(String score) {
		String [] values = {"Love-All", "Fifteen-All","Thirty-All"}; 
		if(player1points<3){
			return values[player1points];
		}
		return "Deuce";
    }

    public String getScore(){
        String score = "";
        if (player1points == player2points && player1points < 4)
        {
            score = sameScore(score);
        }
        if (player1points==player2points && player1points>=3)
            score = "Deuce";
        
        if (player1points > 0 && player2points==0)
        {
            if (player1points==1)
                P1res = "Fifteen";
            if (player1points==2)
                P1res = "Thirty";
            if (player1points==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2points > 0 && player1points==0)
        {
            if (player2points==1)
                P2res = "Fifteen";
            if (player2points==2)
                P2res = "Thirty";
            if (player2points==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (player1points>player2points && player1points < 4)
        {
            if (player1points==2)
                P1res="Thirty";
            if (player1points==3)
                P1res="Forty";
            if (player2points==1)
                P2res="Fifteen";
            if (player2points==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (player2points>player1points && player2points < 4)
        {
            if (player2points==2)
                P2res="Thirty";
            if (player2points==3)
                P2res="Forty";
            if (player1points==1)
                P1res="Fifteen";
            if (player1points==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }
        
        if (player1points > player2points && player2points >= 3)
        {
            score = "Advantage player1";
        }
        
        if (player2points > player1points && player1points >= 3)
        {
            score = "Advantage player2";
        }
        
        if (player1points>=4 && player2points>=0 && (player1points-player2points)>=2)
        {
            score = "Win for player1";
        }
        if (player2points>=4 && player1points>=0 && (player2points-player1points)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }

	
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        player1points++;
    }
    
    public void P2Score(){
        player2points++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}