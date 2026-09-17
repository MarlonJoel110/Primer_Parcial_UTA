import java.util.Scanner;

public class menuSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcion = 0, contador = 0;
        double acumulador = 0.0;
        double salarioMayor = 0.0;
        double salarioMenor = 0.0;
        
        do {
            System.out.println("\n===== SISTEMA DE SALARIOS =====");
            System.out.println("1. Registrar salarios");
            System.out.println("2. Mostrar resumen");
            System.out.println("3. Comparar un salario con el promedio");
            System.out.println("4. Reiniciar informacion");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n*** Registro de Salarios ***");
                    System.out.println("Ingrese los salarios (ingrese un numero negativo para terminar):");
                    
                    System.out.print("Salario: ");
                    double salario = scan.nextDouble();
                    
                    while (salario >= 0) {
                        acumulador += salario;
                        
                        if (contador == 0) {
                            salarioMayor = salario;
                            salarioMenor = salario;
                        } else {
                            if (salario > salarioMayor) {
                                salarioMayor = salario;
                            }
                            if (salario < salarioMenor) {
                                salarioMenor = salario;
                            }
                        }
                        
                        contador++;
                        
                        System.out.print("Salario: ");
                        salario = scan.nextDouble();
                    }
                break;
                    
                case 2:
                    System.out.println("\n--- Resumen de Salarios ---");
                    if (contador > 0) {
                        double promedio = acumulador / contador;
                        System.out.println("Cantidad de salarios: " + contador);
                        System.out.println("Total acumulado: " + acumulador);
                        System.out.println("Promedio de salarios: " + promedio);
                        System.out.println("Salario mayor: " + salarioMayor);
                        System.out.println("Salario menor: " + salarioMenor);
                    } else {
                        System.out.println("No hay salarios registrados en el sistema.");
                    }
                break;
                    
                case 3:
                    System.out.println("\n--- Comparar Salario con el Promedio ---");
                    if (contador > 0) {
                        double promedio = acumulador / contador;
                        System.out.print("Ingrese el salario a comparar: ");
                        double salarioComparar = scan.nextDouble();
                        
                        if (salarioComparar > promedio) {
                            System.out.println("El salario ingresado es MAYOR que el promedio (" + promedio + ").");
                        } else if (salarioComparar < promedio) {
                            System.out.println("El salario ingresado es MENOR que el promedio (" + promedio + ").");
                        } else {
                            System.out.println("El salario ingresado es IGUAL al promedio (" + promedio + ").");
                        }
                    } else {
                        System.out.println("No se puede comparar porque aun no hay un promedio calculado.");
                    }
                break;
                    
                case 4:
                    contador = 0;
                    acumulador = 0.0;
                    salarioMayor = 0.0;
                    salarioMenor = 0.0;
                    System.out.println("\nDatos reiniciados correctamente.");
                break;
                    
                case 0:
                    System.out.println("\nSaliendo del programa...");
                break;
                    
                default:
                    System.out.println("\nOpcion no valida. Intente de nuevo.");
            }
            
        } while (opcion != 0);
        
    }
}

