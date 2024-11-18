

package pruebasemana4z;

import java.util.Scanner;


public class Fabrica {
    public static void main(String []arps){
    int dia1,dia2,dia3,dia4,dia5,dia6,dia7;
     
     
     Scanner entrada=new Scanner(System.in);
     System.out.println("Favor ingrese las horas que trabajo en el dia 1 ");
     dia1=entrada.nextInt();
     
     System.out.println("Favor ingrese las horas que trabajo en el dia 2");
     dia2=entrada.nextInt();
     
     System.out.println("Favor ingrese las horas que trabajo en el dia 3");
     dia3=entrada.nextInt();
     
     System.out.println("Favor ingrese las horas que trabajo en el dia 4");
     dia4=entrada.nextInt();
     
     System.out.println("Favor ingrese las horas que trabajo en el dia 5");
     dia5=entrada.nextInt();
     
     System.out.println("Favor ingrese las horas que trabajo en el dia 6");
     dia6=entrada.nextInt();
     
     System.out.println("Favor ingrese las horas que trabajo en el dia 7");
     dia7=entrada.nextInt();
     
     int horast=dia1+dia2+dia3+dia4+dia5+dia6+dia7;
        System.out.println("Trabajo un total de "+horast+ "horas");
     int se=horast/7;
        System.out.println("Trabajo un promedio de"+se+" horas");
    }
    
}