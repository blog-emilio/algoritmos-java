import java.util.Scanner;

public class Algoritmo5{
	public static void main(String[] args) {

		int reusultado;
		int n2;
		int n1;
		
		
		Scanner leer =new Scanner(System .in);

		System.out.println("bienvenido");

		System.out.println("Favor de ingresar solo numeros enteros");

		System.out.println("Ingresar el numero de la operacion(1.suma, 2.resta,3.multiplicacion o 4.division.)");
		int operacion = leer .nextInt();
		System.out.println("Ingresar el primer numero");
		int numer = leer .nextInt();
		System.out.println("Ingresar el segundo numero");
		int num = leer .nextInt();

		int resultado_suma = numer+num;
		int resultado_resta = numer-num;
		int resultado_multiplicacion = numer*num;
		int resultado_division = numer/num;

		switch(operacion){
			case 1:
			System.out.println("el resultado es:"+resultado_suma);
			break;
			case 2:
			System.out.println("el resultado es:"+ resultado_resta);
			break;
			case 3:
			System.out.println("el resultado es:"+ resultado_multiplicacion);
			break;
			case 4:
			switch(num){
				case 0:
				System.out.println("el cero no es valido para esta operacion");
				break;
				default:
				System.out.println("el resultado es:"+ resultado_division);
				break;
			}
			break;
			default:
			System.out.println("Su operacion no es valida.....");
			break;
			
		}

		System.out.println("Que pase feliz dia");

	}
}