
public class Matriz {

	private int[][] matrizCoordenada = new int[15][12];
	private int[] primeiraLinhaColunaGrupo = new int [2];
	public Matriz(char simbolo) {
		
		switch (simbolo) {
		case 'A':
		case '1':
			setPrimeiraPosicaoDoConjunto(0, 0);
			matrizCoordenada[0][0]= 1;
			break;
		case 'B':
		case '2':	
			setPrimeiraPosicaoDoConjunto(0, 2);
			matrizCoordenada[0][2]= 1;
			matrizCoordenada[1][2]= 1;
			break;
		case 'C':
		case '3':
			setPrimeiraPosicaoDoConjunto(0, 4);
			matrizCoordenada[0][4]= 1;
			matrizCoordenada[0][5]= 1;
			break;
		case 'D':
		case '4':
			setPrimeiraPosicaoDoConjunto(0, 6);
			matrizCoordenada[0][6]= 1;
			matrizCoordenada[1][7]= 1;
			matrizCoordenada[0][7]= 1;
			break;
		case 'E':
		case '5':
			setPrimeiraPosicaoDoConjunto(0, 8);
			matrizCoordenada[0][8]= 1;
			matrizCoordenada[1][9]= 1;
			break;
		case 'F': //confirmar
		case '6':
			setPrimeiraPosicaoDoConjunto(0, 10);
			matrizCoordenada[0][10]= 1;
			matrizCoordenada[0][11]= 1;
			matrizCoordenada[1][10]= 1;
			break;
		case 'G':
		case '7':
			setPrimeiraPosicaoDoConjunto(3, 0);
			matrizCoordenada[3][0]= 1;
			matrizCoordenada[3][1]= 1;
			matrizCoordenada[4][1]= 1;
			matrizCoordenada[4][0]= 1;
			break;
		case 'H':
		case '8':
			setPrimeiraPosicaoDoConjunto(3, 2);
			matrizCoordenada[3][2]= 1;
			matrizCoordenada[4][2]= 1;
			matrizCoordenada[4][3]= 1;
			break;
		case 'I':
		case '9':
			setPrimeiraPosicaoDoConjunto(3, 4);
			matrizCoordenada[3][5]= 1;
			matrizCoordenada[4][4]= 1;			
			break;
		case 'J':
		case '0':
			setPrimeiraPosicaoDoConjunto(3, 6);
			matrizCoordenada[3][7]= 1;
			matrizCoordenada[4][6]= 1;
			matrizCoordenada[4][7]= 1;
			break;
		case 'K':
			setPrimeiraPosicaoDoConjunto(3, 8);
			matrizCoordenada[3][8]= 1;
			matrizCoordenada[5][8]= 1;			
			break;
		case 'L':
			setPrimeiraPosicaoDoConjunto(3, 10);
			matrizCoordenada[3][10]= 1;
			matrizCoordenada[4][10]= 1;
			matrizCoordenada[5][10]= 1;
			break;
		case 'M':
			setPrimeiraPosicaoDoConjunto(6, 0);
			matrizCoordenada[6][0]= 1;
			matrizCoordenada[8][0]= 1;
			matrizCoordenada[6][1]= 1;
			break;
		case 'N':
			setPrimeiraPosicaoDoConjunto(6, 2);
			matrizCoordenada[6][2]= 1;
			matrizCoordenada[6][3]= 1;
			matrizCoordenada[7][3]= 1;
			matrizCoordenada[8][2]= 1;			
			break;
		case 'O':
			setPrimeiraPosicaoDoConjunto(6, 4);
			matrizCoordenada[6][4]= 1;
			matrizCoordenada[8][4]= 1;
			matrizCoordenada[7][5]= 1;
			break;
		case 'P':
			setPrimeiraPosicaoDoConjunto(6, 6);
			matrizCoordenada[6][6]= 1;
			matrizCoordenada[6][7]= 1;
			matrizCoordenada[7][6]= 1;
			matrizCoordenada[8][6]= 1;
			break;
		case 'Q':
			setPrimeiraPosicaoDoConjunto(6, 8);
			matrizCoordenada[6][8]= 1;
			matrizCoordenada[6][9]= 1;
			matrizCoordenada[7][9]= 1;
			matrizCoordenada[7][8]= 1;
			matrizCoordenada[8][8]= 1;
			break;
		case 'R':
			setPrimeiraPosicaoDoConjunto(6, 10);
			matrizCoordenada[6][10]= 1;
			matrizCoordenada[7][10]= 1;
			matrizCoordenada[8][10]= 1;
			matrizCoordenada[7][11]= 1;
			break;
		case 'S':
			setPrimeiraPosicaoDoConjunto(9, 0);
			matrizCoordenada[9][1]= 1;
			matrizCoordenada[10][0]= 1;
			matrizCoordenada[11][0]= 1;			
			break;
		case 'T':
			setPrimeiraPosicaoDoConjunto(9, 2);
			matrizCoordenada[9][3]= 1;
			matrizCoordenada[10][2]= 1;
			matrizCoordenada[10][3]= 1;
			matrizCoordenada[11][2]= 1;					
			break;
		case 'U':
			setPrimeiraPosicaoDoConjunto(9, 4);
			matrizCoordenada[9][4]= 1;			
			matrizCoordenada[11][4]= 1;
			matrizCoordenada[11][5]= 1;
			break;
		case 'V':
			setPrimeiraPosicaoDoConjunto(9, 6);
			matrizCoordenada[9][6]= 1;
			matrizCoordenada[10][6]= 1;
			matrizCoordenada[11][6]= 1;
			matrizCoordenada[11][7]= 1;
			break;	
		case 'W':
			setPrimeiraPosicaoDoConjunto(9, 8);
			matrizCoordenada[9][9]= 1;
			matrizCoordenada[10][8]= 1;
			matrizCoordenada[10][9]= 1;
			matrizCoordenada[11][9]= 1;			
			break;
		case 'X':
			setPrimeiraPosicaoDoConjunto(9, 10);
			matrizCoordenada[9][10]= 1;
			matrizCoordenada[9][11]= 1;
			matrizCoordenada[11][10]= 1;
			matrizCoordenada[11][11]= 1;
			break;
		case 'Y':
			setPrimeiraPosicaoDoConjunto(12, 0);
			matrizCoordenada [12][0]= 1;
			matrizCoordenada[12][1]= 1;
			matrizCoordenada[13][1]= 1;
			matrizCoordenada[14][0]= 1;
			matrizCoordenada[14][1]= 1;
			break;
		case 'Z':
			setPrimeiraPosicaoDoConjunto(12, 2);
			matrizCoordenada[12][2]= 1;
			matrizCoordenada[13][3]= 1;
			matrizCoordenada[14][2]= 1;
			matrizCoordenada[14][3]= 1;
			break;
			

		default:
			break;
		}
	}
	
	private void setPrimeiraPosicaoDoConjunto(int linha, int coluna)
	{
		primeiraLinhaColunaGrupo[0]=linha;
		primeiraLinhaColunaGrupo[1]=coluna;
		
	}

	public Coordenada getCoordenada() {
		return new Coordenada(primeiraLinhaColunaGrupo);
		
	}

	public String escreverMatriz() {
		String saida = "";
		
		for (int i = primeiraLinhaColunaGrupo[0]; i < primeiraLinhaColunaGrupo[0]+3; i++) 
		{
			saida += "|"; 
			for (int j = primeiraLinhaColunaGrupo[1]; j < primeiraLinhaColunaGrupo[1]+2; j++)
			{
				
				if(matrizCoordenada[i][j]==1)
				{ 
					saida += "•|";					
				}
				else
					saida += "0|";
				
			}
			if(saida.charAt(saida.length()-1) == '|' )
			saida+= " \n";
			else
				saida+= "|\n";
			
		}
		return saida;
	}

}
