
public class Coordenada {

	private int x;
	private int y;
	private final int xOrigem = 4;
    private final int yOrigem = 6;
    public static Coordenada coordenadaNumeral;
    
	public Coordenada(int[] primeiraLinhaColunaGrupo) {
		
		y =  (yOrigem - primeiraLinhaColunaGrupo[0]) / 3;
//		if(primeiraLinhaColunaGrupo[1]%2==0)
//			y++;
		x = (primeiraLinhaColunaGrupo[1] - xOrigem)/2;		
	}
	
	private Coordenada() {
		
	
	}

	public int getX() {
		return x;
	}

	private  void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private  void setY(int y) {
		this.y = y;
	}
	
	
	public Coordenada  voltarParaOrigem()
	{
		Coordenada c  = new Coordenada();
		c.setX(this.getX()*-1);
		c.setY(this.getY()*-1);
		return c;
	}
	
	public Coordenada  voltarParaOrigem(Coordenada coord)
	{
		Coordenada c  = new Coordenada();
		c.setX(coord.getX()*-1);
		c.setY(coord.getY()*-1);
		return c;
	}
	public static void instanciarCoordenadaNumeral()
	{
		if(coordenadaNumeral == null)
		{
			coordenadaNumeral= new Coordenada(new int[] {12,6});
			
		}
		
	}

	
	

}
