import java.util.Scanner;

public class App {

    public static void mostrarResumen(double[] ventas) {
      double total = 0; // valor por defecto double es 0.0
      System.out.println("Ventas diarias: ");
      for(int i=0; i < ventas.length ; i++) {
        System.out.println("Dia " + (i+1) + ": " + ventas[i]);
        // total = total + ventas[i]; // acumulando el total de las ventas
        total += ventas[i]; // acumulando el total de las ventas
      }
      System.out.println("total de ventas: " + total);
    }

    public static void main(String[] args)  {

      Scanner scanner = new Scanner(System.in);
      double [] ventasSemanal = new double[7]; // la longitud del array es 7, para los 7 dias de la semana

      System.out.println("Registro de ventas semanales de la panaderia: ");

      for(int i=0; i < ventasSemanal.length; i++) {
        System.out.print("Ingrese las ventas del dia " + (i+1) + ": ");
        ventasSemanal[i] = scanner.nextDouble();
      }
      mostrarResumen(ventasSemanal);
     
    }

}
// 
/* */