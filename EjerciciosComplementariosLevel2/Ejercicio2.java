import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        System.out.println("Ingrese 5 numeros: ");

        for (int i=1; i<=5; i++){
            nums.add(sc.nextInt()); 
        }
        System.out.println("Ahora ingrese uno al principio: ");
        nums.add(0, sc.nextInt());
        System.out.println("Ahora otro al final: ");
        nums.add(6, sc.nextInt());

        
        Iterator<Integer> Iter = nums.iterator();
        while(Iter.hasNext()){
            Integer elemento = Iter.next();
            System.out.println(elemento);

        }
    }
}