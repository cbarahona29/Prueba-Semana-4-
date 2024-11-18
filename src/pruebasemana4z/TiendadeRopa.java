package pruebasemana4z;

import java.util.Scanner;

public class TiendadeRopa {
      public static void main(String []arps){
     int productos;
     int contador=1;
     int sumap=0;
          Scanner entrada=new Scanner(System.in);
          System.out.println("Cuantos productos desea ingresar");
          productos=entrada.nextInt();
          
          while (contador <= productos) {
            int cantidadn = -1;
                System.out.println("Ingrese la cantidad de inventario de los productos #" + contador);
              int inventario = entrada.nextInt();      
              

      sumap += inventario;
      contador++;
          
    }
          System.out.println("Se registraron "+productos+ " productos en el inventario");
          System.out.println("El total de productos en el inventario es de:"+sumap);
          
      }
}