package com.mycompany.ejerciciorn10;
import java.util.Scanner;
public class EjercicioRN10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de inscripción: ");
        String NI = scanner.next();
        scanner.nextLine();// Consumir el salto de línea pendiente
        System.out.print("Ingrese el nombre del estudiante: ");
        String NOM = scanner.nextLine();
        System.out.print("Ingrese el monto del pago de patrimonio: ");
        double PAT = scanner.nextDouble();
        System.out.print("Ingrese el número de semestres de estudio: ");
        int ES = scanner.nextInt();

        double PAGMAT = 50000;

        if (PAT > 2000000 && ES > 3) {
            PAGMAT += 0.03 * PAT;
        }

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + NI +
                " Y NOMBRE " + NOM + " DEBE PAGAR: $" + PAGMAT);

        scanner.close();
    }
}
