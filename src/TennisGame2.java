public class TennisGame2 implements TennisGame
{
    public int player1point = 0;
    public int player2point = 0;
    
    public String player1result = "";
    public String player2result = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        score = sameScoreLessThanFour(score);
        score = sameScoreGreaterEqualToThree(score);
        score = player1isWinningPlayer2GoesToZero(score);
        score = player2isWinningPlayer1GoesToZero(score);
        score = player1isWinningLessThanFour(score);
        score = player2isWinningLessThanFour(score);
        score = player1isWinningByOnePoint(score);
        score = player2isWinningByOnePoint(score);
        score = player1Win(score);
        score = player2Win(score);
        return score;
    }

	private String player2Win(String score) {
		if (player2point>=4 && player1point>=0 && (player2point-player1point)>=2)
        {
            score = "Win for player2";
        }
		return score;
	}

	private String player1Win(String score) {
		if (player1point>=4 && player2point>=0 && (player1point-player2point)>=2)
        {
            score = "Win for player1";
        }
		return score;
	}

	private String player2isWinningByOnePoint(String score) {
		if (player2point > player1point && player1point >= 3)
        {
            score = "Advantage player2";
        }
		return score;
	}

	private String player1isWinningByOnePoint(String score) {
		if (player1point > player2point && player2point >= 3)
        {
            score = "Advantage player1";
        }
		return score;
	}

	private String player2isWinningLessThanFour(String score) {
		if (player2point>player1point && player2point < 4)
        {
            if (player2point==2)
                player2result="Thirty";
            if (player2point==3)
                player2result="Forty";
            if (player1point==1)
                player1result="Fifteen";
            if (player1point==2)
                player1result="Thirty";
            score = player1result + "-" + player2result;
        }
		return score;
	}

	private String player1isWinningLessThanFour(String score) {
		if (player1point>player2point && player1point < 4)
        {
            if (player1point==2)
                player1result="Thirty";
            if (player1point==3)
                player1result="Forty";
            if (player2point==1)
                player2result="Fifteen";
            if (player2point==2)
                player2result="Thirty";
            score = player1result + "-" + player2result;
        }
		return score;
	}

	private String player2isWinningPlayer1GoesToZero(String score) {
		if (player2point > 0 && player1point==0)
        {
            if (player2point==1)
                player2result = "Fifteen";
            if (player2point==2)
                player2result = "Thirty";
            if (player2point==3)
                player2result = "Forty";
            
            player1result = "Love";
            score = player1result + "-" + player2result;
        }
		return score;
	}

	private String player1isWinningPlayer2GoesToZero(String score) {
		if (player1point > 0 && player2point==0)
        {
            if (player1point==1)
                player1result = "Fifteen";
            if (player1point==2)
                player1result = "Thirty";
            if (player1point==3)
                player1result = "Forty";
            
            player2result = "Love";
            score = player1result + "-" + player2result;
        }
		return score;
	}

	private String sameScoreGreaterEqualToThree(String score) {
		if (player1point==player2point && player1point>=3)
            score = "Deuce";
		return score;
	}

	private String sameScoreLessThanFour(String score) {
		if (player1point == player2point && player1point < 4)
        {
            if (player1point==0)
                score = "Love";
            if (player1point==1)
                score = "Fifteen";
            if (player1point==2)
                score = "Thirty";
            score += "-All";
        }
		return score;
	}
    
    public void setPlayer1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            player1Score();
        }
            
    }
    
    public void setPlayer2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            player2Score();
        }
            
    }
    
    public void player1Score(){
        player1point++;
    }
    
    public void player2Score(){
        player2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            player1Score();
        else
            player2Score();
    }
}