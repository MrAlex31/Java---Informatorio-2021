import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int num, factorial = 1 ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Ingrese un numero:");
        num = sc.nextInt();

        for( int i = 1; i <= num; i++ ) {
            factorial *= i;
        }   
        System.out.println("El factorial de "+ num +" es: "+  factorial );
    }
}
