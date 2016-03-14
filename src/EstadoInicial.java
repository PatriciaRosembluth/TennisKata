public class EstadoInicial implements Estado {
	public int player1points = 0;
    public int player2points = 0;
    
    public String P1result = "";
    public String P2result = "";
    private String player1Name;
    private String player2Name;
    private Estado deuce = new EstadoDeuce();
    private Estado win = new EstadoWin();
    
    public EstadoInicial(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    
	public String calcularPuntaje(int player1points,int player2points){
		String [] scoreToName ={"Love", "Fifteen","Thirty", "Forty"}; 
		 if (player1points == player2points){
	            return sameScore();
		 }else if(player1points >=4 && player1points-player2points >= 2 || player2points>=4 && player2points-player1points >= 2){
			 return win.calcularPuntaje(player1points, player2points);
		 }
		return scoreToName[player1points]+ "-" + scoreToName[player2points];
		
	}
	
	private String sameScore() {
		String [] values = {"Love-All", "Fifteen-All","Thirty-All"}; 
		if(player1points<3){
			return values[player1points];
		}
		return deuce.calcularPuntaje(player1points, player2points);
    }
}	
