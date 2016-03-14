public class EstadoDeuce implements Estado {
	private Estado advantage = new EstadoAdvantage();
	
	public String calcularPuntaje(int player1points, int player2points){
		if (player1points >=4 || player2points>=4){
        	return scoreAboveFour(player1points, player2points);
        }
		return "deuce";
	}
	
	private String scoreAboveFour(int player1points, int player2points) {
		return advantage.calcularPuntaje(player1points, player2points);
    }

}
