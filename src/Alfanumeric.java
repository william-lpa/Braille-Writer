
public class Alfanumerico {

	private char simbolo;
	private Coordenada coordenada;
	private Matriz matriz;
	
	public Alfanumerico(char simbolo ) {
		
		this.simbolo = simbolo;		
		this.matriz = new Matriz(simbolo);
		this.coordenada = matriz.getCoordenada();
	}

	public char getSimbolo() {
		return simbolo;
	}	

	public Coordenada getCoordenada() {
		return coordenada;
	}	

	public Matriz getMatriz() {
		return matriz;
	}

	public String escreverMatriz()
	{
		return matriz.escreverMatriz();
		
	}
		
	
}
