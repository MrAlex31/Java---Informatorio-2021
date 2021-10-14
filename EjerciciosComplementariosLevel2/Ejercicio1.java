import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        
        System.out.println("Ingrese de forma ordenada sus ciudades preferidas: ");

        for (int i=1; i<=3; i++){
            ciudades.add("#"+i+" - "+sc.nextLine()); 
        }
        
        Iterator<String> Iter = ciudades.iterator();
        while(Iter.hasNext()){
            String elemento = Iter.next();
            System.out.println(elemento);

        }
    }
}