public class EstadoAdvantage implements Estado {
	private Estado deuce = new EstadoDeuce();
	private Estado win = new EstadoWin();
	public String calcularPuntaje(int player1points, int player2points){
		int pointsDifference = player1points - player2points;
		if (pointsDifference == 1){
			return "Advantage player1";
		}else if (pointsDifference == -1){
			return "Advantage player2";
		}else if (pointsDifference == 0){
			return deuce.calcularPuntaje(player1points, player2points);
		}
		return win.calcularPuntaje(player1points, player2points);
	}

}
