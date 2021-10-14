import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String palabra;
		char c;
        System.out.println("Ingrese una palabra");   
		palabra= sc.nextLine();
		 
        for (int i = 0; i < palabra.length(); i++){
            int ascii = palabra.charAt(i);
            ascii=ascii-32;
		     c = (char)(ascii);
		    System.out.print(c);
        
        }
	}

}