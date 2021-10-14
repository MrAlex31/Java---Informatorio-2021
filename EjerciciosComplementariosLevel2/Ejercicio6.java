import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> diccionario = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(40912614, "Brian Schulz", 160, 375));
        empleados.add(new Empleado(34588892, "Pepe Monzón", 160, 475));
        empleados.add(new Empleado(39899901, "Belén Casimiro", 160, 575));
        empleados.add(new Empleado(22104533, "Tamara Arias", 160, 675));
        for (Empleado i:empleados){
            int sueldo = i.getValorHora() * i.getHorasTrabajadas();
            diccionario.put(i.getDni(), sueldo);
            System.out.println("DNI: " + i.getDni() + "Sueldo: " + sueldo);
        }
    }
    static class Empleado{
        private int dni;
        private String nombre;
        private int horasTrabajadas;
        private int valorHora;
        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }
        public int getDni() {
            return dni;
        }
        public String getNombre() {
            return nombre;
        }
        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }
        public int getValorHora() {
            return valorHora;
        }
    }
}