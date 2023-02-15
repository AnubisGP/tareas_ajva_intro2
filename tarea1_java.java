//Para un conjunto de 5 numeros, convertirlos en uno solo
import java.util.Scanner;

public class tarea1 {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        int n1, n2, n3, n4, n5;
        System.out.println("Ingrese un total de 5 numeros");
        System.out.println(" Ingrese el primer numero: ");
        n1 = entrada.nextInt();
        System.out.println(" Ingrese el segundo numero: ");
        n2 = entrada.nextInt();
        System.out.println(" Ingrese el tercer numero: ");
        n3 = entrada.nextInt();
        System.out.println(" Ingrese el cuarto numero: ");
        n4 = entrada.nextInt();
        System.out.println(" Ingrese el quinto numero: ");
        n5 = entrada.nextInt();

        System.out.println("La union de los cinco numeros es: "+n1+n2+n3+n4+n5);
    }
}
