import java.util.Scanner;

public class Algoritmo4{
	public static void main(String[] args) {


		Scanner leer = new Scanner(System .in);

		System.out.println("Favor ingresar un numero del 1 al 10.");

		System.out.println("Ingresa un numero entero.");
		int numero = leer .nextInt();




		switch(numero){
			case 1:
			System.out.println("el numero binario de 1 es: 00000001");
			break;
			case 2:
			System.out.println("el numero binario de 2 es: 00000010");
			break;
			case 3:
			System.out.println("el numero binario de 3 es: 00000011");
			break;
			case 4:
			System.out.println("el numero binario de 4 es: 00000100");
			break;
			case 5:
			System.out.println("el numero binario de 5 es: 00000101");
			break;
			case 6:
			System.out.println("el numero binario de 6 es: 00000110");
			break;
			case 7:
			System.out.println("el numero binario de 7 es: 00000111");
			break;
			case 8:
			System.out.println("el numero binario de 8 es: 00001000");
			break;
			case 9:
			System.out.println("el numero binario de 9 es: 00001001");
			break;
			case 10:
			System.out.println("el numero binario de 10 es: 00001010");
			break;
			default:
			System.out.println("opcion no valida para el programa");
			break;
			}
	}
}