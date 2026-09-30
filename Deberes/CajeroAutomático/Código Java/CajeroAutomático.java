/* 
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
*/ 
package cajeroautomático; 

import java.util.Scanner; 

/** 
* 
* @author USUARIO 
*/ 
public class CajeroAutomático { 
    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        double saldo = 1000.00;
        double cantidad; 
        int opcion; 

        do {
            System.out.println("\n===== CAJERO AUTOMATICO ====="); 
            System.out.println("1. Depositar"); 
            System.out.println("2. Retirar"); 
            System.out.println("3. Mostrar saldo"); 
            System.out.println("4. Salir"); 
            System.out.print("Seleccione una opcion: "); 
            opcion = scan.nextInt(); 
      
            switch(opcion) { 
                case 1: 
                    System.out.print("Ingrese la cantidad a depositar: "); 
                    cantidad = scan.nextDouble(); 
      
                    if (cantidad > 0) { 
                        saldo = saldo + cantidad; 
                        System.out.println("Deposito realizado correctamente."); 
                        System.out.printf("Nuevo saldo: $%.2f%n", saldo); 
                    } else { 
                        System.out.println("La cantidad debe ser mayor que 0."); 
                    } 
                break; 
      
                case 2: 
                    System.out.print("Ingrese la cantidad a retirar: "); 
                    cantidad = scan.nextDouble(); 
    
                    if (cantidad > 0 && cantidad <= saldo) { 
                        saldo = saldo - cantidad; 
                        System.out.println("Retiro realizado correctamente."); 
                        System.out.printf("Nuevo saldo: $%.2f%n", saldo); 
                    } else if (cantidad > saldo) { 
                        System.out.println("Saldo insuficiente."); 
                    } else { 
                        System.out.println("La cantidad debe ser mayor que 0."); 
                    } 
                break; 
      
                case 3: 
                    System.out.printf("Su saldo actual es: $%.2f%n", saldo); 
                break; 
      
                case 4: 
                    System.out.println("Gracias por utilizar el cajero automático."); 
                break; 
    
                default: 
                    System.out.println("Opcion no valida."); 
                break; 
            } 
        } while (opcion != 4);
    } 
}
