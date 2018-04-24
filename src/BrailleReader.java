import lejos.nxt.Motor;

public class LeitorBraile {

	//private static final String palavra = "ABCDEFGHIJKLMNOPQRSTUVXWYZ 0123456789";
	private static final String palavra = "aurelio";

	public static void main(String[] args) 
	{
		Motor.A.setSpeed(100);
		Motor.C.setSpeed(50);
		Motor.B.setSpeed(200);
		//Motor.B.setSpeed(200);
		
//		while(true)
//		{
//			
//		  Motor.A.rotate(120);
//		  Motor.B.rotate(-720);
//		  waitFor(2000);
//		  erguerPlataforma();
//		  Motor.B.rotate(720);
//		  Motor.A.rotate(-120);
//		  
//		  waitFor(2000);
//		  
//		  Motor.B.rotate(1440);
//		  waitFor(2000);
//		  erguerPlataforma();
//		  waitFor(2000);
//		  Motor.C.rotate(80);		  
//		  Motor.A.rotate(-220);
//		  waitFor(2000);
//		  Motor.B.rotate(-1440);
//		  waitFor(2000);
		 
		//}

		Coordenada.instanciarCoordenadaNumeral();
		String palavraMax = palavra.toUpperCase();

		for (int i = 0; i < palavraMax.length(); i++) {
			
			char caractere = palavraMax.charAt(i);
			Alfanumerico simbolo = new Alfanumerico(caractere);
			System.out.println(simbolo.getSimbolo());
			System.out.println(simbolo.escreverMatriz());
			
					
			if(caractere == ' ')
			{
				waitFor(3000); //pausa
			}
			
			if(Character.isDigit(caractere))
			{
				posicionarPlataforma(Coordenada.coordenadaNumeral);
				erguerPlataforma();
				posicionarPlataforma(simbolo.getCoordenada().voltarParaOrigem(Coordenada.coordenadaNumeral));
				waitFor(2000); //pausa
			}
			posicionarPlataforma(simbolo.getCoordenada());
			erguerPlataforma();
			posicionarPlataforma(simbolo.getCoordenada().voltarParaOrigem());
			waitFor(2000); //pausa
			
				
		}

	}

	private static void waitFor(int milisegundos) 
	{
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void posicionarPlataforma(Coordenada coordenada) 
	{
		posicionarEixoX(coordenada.getX());
		posicionarEixoY(coordenada.getY());

	}

	private static void posicionarEixoY(float y) {
		if (y > 0)
		{
			while ( y>0)
			{
				Motor.B.rotate(-360);
				y--;
			}
			//Motor.B.rotate(-30);
		}
		else{
			while (y<0)
			{
				Motor.B.rotate(360);
				y++;
			}
			//Motor.B.rotate(30);
		}
		
	}

	private static void posicionarEixoX(float x) {
		 		
		if (x > 0)
			while (x!=0)
			{
				Motor.A.rotate(-55);
				x--;
			}
		else
			while (x!=0)
			{
				Motor.A.rotate(55);
				x++;
			}		
	}

	private static void  erguerPlataforma() 
	{
		Motor.C.rotate(-60);
		waitFor(2500);
		Motor.C.rotate(60);

	}

}
