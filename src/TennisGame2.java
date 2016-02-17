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
    
    private String sameScore() {
		String [] values = {"Love-All", "Fifteen-All","Thirty-All"}; 
		if(player1points<3){
			return values[player1points];
		}
		return "Deuce";
    }
    
    private String scoreAboveFour() {
		int scoreDifference = player1points - player2points;
		if (scoreDifference == 1){
			return "Advantage player1";
		}else if (scoreDifference == -1){
			return "Advantage player2";
		}else if (scoreDifference >= 2){
			return "Win for player1";
		}
		return "Win for player2";
		
    }

    public String getScore(){
        String score = "";
        int tempScore=0;
        if (player1points == player2points){
            return sameScore();
        }else if (player1points >=4 || player2points>=4){
        	return scoreAboveFour();
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player1points;
                else { score+="-"; tempScore = player2points;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
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