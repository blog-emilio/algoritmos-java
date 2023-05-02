import java.util.Scanner;

public class Algoritmo3{
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		System.out.println("Bienvenidos a este programa. favor de ingresar solo numeros enteros");

		System.out.println("Ingresar el cateto adyacente");
		double cateto_A =leer .nextInt();
		System.out.println("Ingerar el cateto opuesto");
		double cateto_B = leer .nextInt();

		double hipotenusa=Math.sqrt( (cateto_B * cateto_B) + (cateto_A * cateto_A) );
		System.out.println("La hipotenusa es:"+hipotenusa);

	}
}