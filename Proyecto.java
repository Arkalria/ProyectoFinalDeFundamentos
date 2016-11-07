import java.util.Scanner;

public class Proyecto{
	public static void main(String[] args){
		// Declaración de constantes.
		Scanner in = new Scanner(System.in);
		final double NUMSERP = 0.07; //Porcentaje de casillas que son serpientes.
		final double MAXSERP = 0.35; //Porcentaje máximo de casillas que se pueden bajar con una serpiente.
		final double NUMESCA = 0.08; //Porcentaje de casillas que son escaleras.
		final double MAXESCA	= 0.45; //Porcentaje máximo de casillas que se pueden subir con una escalera.
		final String[] OBJETO = {"Molino", "Pozo"}; //Primer componente para nombrar a una casilla.
		final String[] ADJETIVO = {"Rojo", "Verde"}; //Segundo componente para nombrar una casilla.
		//Declaración de variables.
		int opc = 0; //Opción elegida del menú principal.
		int casCreadas = 0; //Auxiliar para contar cuantas casillas han sido creadas, para las serpientes y escaleras.
		int  = 0; //Auxiliar para 
		int[][] tablero = [0][0]; //Casillas que contiene el tablero [Su número es i + 1] [0 - Nombre de la casilla / 1 -Descripción] .
		
		System.out.println("Bienvenido al juego de serpientes y escaleras.");
		do{
			//Despliegue del menú principal.
			System.out.println("--- Menu Principal ---");
			System.out.println("   1 - Crear tablero de juego.");
			System.out.println("   2 - Modificar casilla.");
			System.out.println("   3 - Jugar.");
			System.out.println("   0 - Salir.");
			System.out.print("Teclea una opcion: ");
			opc = in.nextInt();
			//Evaluación de la opción elegida.
			switch(opc){
				case 1: //Crear tablero.
					System.out.print("Teclea el numero de casillas: ");
					tablero = new int[in.nextInt()][2];
					/*
					crear escaleras 
						pedir nombre
						pedir descripcion
						while i < floor (tablero.length * NUMSERP)
							if 
					*/
					
					break;
				case 2:
					if(tablero.length != 0){
						
					}else{
						System.out.println("Debes crear un tablero primero para poder modificarlo.");
					}
					
					break;
				case 3:
					if(tablero.length != 0){
						
					}else{
						System.out.println("Debes crear un tablero primero para poder jugar.");
					}
					break;
				default:
					System.out.println("Esa no es una opcion valida.");
					break;
			}
		}while(opc != 0);
		
		System.out.println("Hasta luego.");
		
		/*
		System.out.println("");
		System.out.print("");
		*/
	}
	
	public static void crearTablero(){ //Da el nombre y descripción de las casillas del tablero.
	
	}
	
	public static int aleatorio(int min, int max){ //Regresa un valor entre min y max. Se usa para dar una casilla o tirar el dado.
		// return ;
	}
	
	public static boolean casillaOcupada(){ //Verifica si una casilla ya fue usada por una serpiente o escalera.
		
	}
}