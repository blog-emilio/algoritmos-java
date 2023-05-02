//programa java para leer datos de varios tipos usando la clase scaner
import java.util.Scanner;

public class Algoritmo1{
	public static void main(String[] args) {

		//configurando scaner
		//declarar el objeto e inicializar con el objeto de entrada predefinido
		Scanner leer = new Scanner(System.in);

		System.out.println("bienvenido, favor de ingresar solo numeros enteros");

		System.out.println("ingresa la base");
		int base = leer .nextInt();
		System.out.println("ingresa la altura");
		int altura = leer .nextInt();

		int area = (base*altura);
		int perimetro = (2*base + 2*altura);

		System.out.println("el area es de:" + area);
		System.out.println("el perimetro es de:" + perimetro);

		System.out.println("Gracias por usar este programa");

	}
}