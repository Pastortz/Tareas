package ejercico3008;

import java.util.Scanner;

public class Ejercico3008 {

    public static void main(String[] args) {
        // crear un vectores  
        int i;
        int numeroAcumulado=0,contador=0;
        String pregunta;
        double promedio;
        Scanner lector = new Scanner(System.in);
        //Ingresar 10 cslificaciones
        System.out.println("Ingrese calificaciones:");
        int[] sueldo = new int[10];

        for (i = 0; i < 10; i++) {
            sueldo[i] = lector.nextInt();
        }
        System.out.println("El quinto valor es :" + sueldo[4]);
        System.out.println("El untimo valoe es :" + sueldo[9]);
        System.out.println("El octavo valor es : " + sueldo[7]);
        for (i = 9; i >= 0; i--) {
            System.out.println(sueldo[i]);

        }
        do {            
            
        
        System.out.println("¿Que nota desea ver?");
        int numero=lector.nextInt();
         numeroAcumulado=numeroAcumulado+sueldo[numero-1];
         contador++;
        System.out.println("la nota de la posicion es "+numero+" es "+sueldo[numero-1]);
            System.out.println("Desea seguir viendo calificaciones ");
            
            
            pregunta=lector.next().toUpperCase();
        } while (pregunta.equals("SI"));
        System.out.println("EL reultado dela sumas de la calificacione es :"+numeroAcumulado);
        System.out.println("se mostraron" + promedio +"notas");
        promedio=numeroAcumulado/contador;
        System.out.println("El promedio es: "+promedio);
    }
}
