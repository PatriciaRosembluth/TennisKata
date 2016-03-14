
public class EstadoWin implements Estado{
	
	public String calcularPuntaje(int player1points, int player2points){
		int pointsDifference = player1points - player2points;
		if (pointsDifference >= 2){
			return "Win for player1";
		}
		return "Win for player2";
	}
}
