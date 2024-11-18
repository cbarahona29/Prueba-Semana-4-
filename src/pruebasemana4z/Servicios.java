package pruebasemana4z;

import java.util.Scanner;

public class Servicios {
      public static void main(String []arps){
     int enero,febrero,marzo,abril,mayo,junio,julio,agosto,septiembre,octubre,noviembre,diciembre;
     
     
     Scanner entrada=new Scanner(System.in);
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Enero");
     enero=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Febrero");
     febrero=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Marzo");
     marzo=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Abril");
     abril=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Mayo");
     mayo=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Junio");
     junio=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Julio ");
     julio=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Agosto ");
     agosto=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Septiembre");
     septiembre=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Octubre");
     octubre=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Noviembre");
     noviembre=entrada.nextInt();
     
     System.out.println("Favor ingrese su consumo de agua mensual en litros de Diciembre");
     diciembre=entrada.nextInt();
     
     int consumoa=enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre;
     int consumom=consumoa/12;
     
          System.out.println("Su consumo anual fue de: "+consumoa+" litros");
          System.out.println("Su consumo mensual fue de: "+consumom+" litros");
     
          
    }
}