import java.util.Scanner;
import java.util.Formatter;
    public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nomYape,edad,direccion,ciudad;
        
        System.out.print("Introduce tu nombre y apellido: ");
        nomYape= sc.nextLine();
        
        System.out.print("Introduce tu edad: ");
        edad= sc.nextLine();
        
        System.out.print("Introduce tu direccion: ");
        direccion= sc.nextLine();
        
        System.out.print("Introduce tu ciudad: ");
        ciudad= sc.nextLine();

        // Formatter:
        Formatter formatter = new Formatter();

        Object cadenaFormato = formatter.format("{   %-7s} - {   %-9s} - {   %-7s} - {   %-19s}", ciudad, direccion, edad, nomYape );
        System.out.println("{  Ciudad  } - { Dirección  } - {   Edad   } - {  Nombre y Apellido   }");                                   
        System.out.println(cadenaFormato);
    }
}