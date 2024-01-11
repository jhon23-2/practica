package git;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;


public class Git {

    public static void main(String[] args) {
        // Formato de fechas en java
        Scanner leer = new Scanner(System.in);

        LocalDate fecha = LocalDate.of(2003, Month.JANUARY, 24);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fecha, ahora);

        System.out.println("------------------------------------------");
        System.out.println("Linea dos ----------------------------");
        System.out.println("Linea Tres ----------------------------");
        System.out.println("Linea Cuatro ----------------------------");
        
        System.out.println("Dias: " + periodo.getDays());
        System.out.println("Meses: " + periodo.getMonths());
        System.out.println("Anios: " + periodo.getYears());
        
        
    }


    public boolean validarFecha(LocalDate fechaAvalidar , LocalDate before , LocalDate after){
        return !fechaAvalidar.isBefore(before) && !fechaAvalidar.isAfter(after);
    }

}
