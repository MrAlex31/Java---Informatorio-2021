import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        int num1, num2, result= 1 ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        for( int i = 1; i <= num2; i++ ) {
            result *= num1;
        }   
        System.out.println( num1 + " ^ " +  num2 + " = " + result );
    }
}