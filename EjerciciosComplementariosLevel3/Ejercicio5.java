import java.time.*;
import java.util.*;
import java.util.stream.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(55)), 
                                       new Alumno("Bart", "Simpson", LocalDate.of(1998, 1, 10)),
                                       new Alumno("Maggie", "Simpson", LocalDate.of(2008, 4, 13)),
                                       new Alumno("Lisa", "Simpson", LocalDate.of(1999, 2, 11)),
                                       new Alumno("Marge", "Simpson", LocalDate.of(1975, 3, 12)));
        Map<String,Integer> edad = alumnos.stream()
                              .collect(Collectors.toMap(p-> (p.getName() + " " + p.getSurname()),
                                                        p -> Ejercicio5.getEdad(p.getBirthday())));
        System.out.print(edad);
    }
    public static Integer getEdad(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
