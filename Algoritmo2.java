import java.util.Scanner;

public class Algoritmo2{
	public static void main(String[] args) {

         int menor;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a este programa. Favor de seguir la instrucciones dadas a continuacion.");
        
        System.out.println("favor de ingresar solo numeros enteros. Y que sean distintos");

        System.out.println("favor ingresar un numero");
        int variable_1 = leer .nextInt();
        System.out.println("favor de ingresar otro numero");
        int variable_2 = leer .nextInt();
        System.out.println("favor de ingresar otro numero");
        int variable_3 = leer .nextInt();



       if(variable_1 < variable_2 && variable_1 < variable_3){
       	menor = variable_1;
       	System.out.println("el numero menor es:"+ menor);
       }
       if(variable_2 < variable_3 && variable_2 < variable_1){
       	menor = variable_2;
       	System.out.println("El numero menor es:"+ menor);
       }
       if(variable_3 < variable_2 && variable_3 < variable_1){
       	menor = variable_3;
       	System.out.println("El numero menor es:"+ menor);
       }
	}
}