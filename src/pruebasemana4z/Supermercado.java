
package pruebasemana4z;

import java.util.Scanner;

public class Supermercado {
     public static void main(String[] args) {
      int productos;
      int cantidad;
      int contador = 1;
      int sumap = 0;
      
      Scanner sc=new Scanner(System.in);
      
         System.out.println("Favor ingrese cuantos productos va a comprar");
         cantidad=sc.nextInt();
         
         while (contador <= cantidad) {
            int cantidadn = -1;
                System.out.println("Ingrese el precio de los productos #" + contador);
              int Precio = sc.nextInt();      
              

      sumap += Precio;
      contador++;
    }
     
     
         System.out.println("El costo total sera de "+sumap);
     }
}