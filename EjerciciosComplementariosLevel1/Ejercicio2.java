import java.util.Scanner;

 public class Ejercicio2 {

    public static void main(String[] args){

        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();

        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();
        
        //mostrar resultado
        System.out.println( n1 + " + " + n2  + " = " + ( n1 + n2 ));                      
        System.out.println( n1 + " - " + n2 + " = " + ( n1 - n2 ));                      
        System.out.println( n1 + " * " + n2 + " = " + ( n1 * n2 ));                      
        System.out.println( n1 + " / " + n2 + " = " + ( n1 / n2 ));                      
        System.out.println( n1 + " % " + n2 + " = " + ( n1 % n2 ));                      

    }
}