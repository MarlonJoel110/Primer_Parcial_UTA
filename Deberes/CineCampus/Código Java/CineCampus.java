import java.util.Scanner;

public class CineUniversitario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n- - - - - CINE CAMPUS - - - - -");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Consultar precios");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Formato (1=2D, 2=3D, 3=IMAX): ");
                    int formato = sc.nextInt();
                    double precio = 0;
                    
                    switch (formato) {
                        case 1: precio = 5.00; break;
                        case 2: precio = 7.50; break;
                        case 3: precio = 10.00; break;
                        default: 
                            System.out.println("Formato invalido."); 
                            continue;
                    }

                    System.out.print("Cantidad de entradas: ");
                    int cantidad = sc.nextInt();
                    if (cantidad <= 0) {
                        System.out.println("Cantidad invalida.");
                        continue;
                    }

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    if (edad < 0 || edad > 120) {
                        System.out.println("Edad fuera del rango (0 a 120).");
                        continue;
                    }

                    System.out.print("Es estudiante (1=Si, 2=No): ");
                    int est = sc.nextInt();

                    System.out.print("Dia de la semana (1=Lunes ... 7=Domingo): ");
                    int dia = sc.nextInt();
                    if (dia < 1 || dia > 7) {
                        System.out.println("Dia invalido.");
                        continue;
                    }

                    double subtotal = precio * cantidad;
                    double porcentaje = 0;
                    String promo = "Ninguna";

                    if (edad >= 65) {
                        porcentaje = 0.30;
                        promo = "30% por adulto mayor";
                    } else if (edad <= 11) {
                        porcentaje = 0.20;
                        promo = "20% por niño";
                    } else if (est == 1 && dia >= 1 && dia <= 5) {
                        porcentaje = 0.15;
                        promo = "15% estudiante entre semana";
                    } else if (dia == 3) {
                        porcentaje = 0.10;
                        promo = "10% miercoles";
                    }

                    double descuento = subtotal * porcentaje;
                    double recargo = 0;
                    if ((dia == 6 || dia == 7) && formato == 3) {
                        recargo = subtotal * 0.10;
                    }

                    double total = subtotal - descuento + recargo;
                    String combo = "No";
                    if (cantidad >= 4 && (est == 1 || edad <= 11)) {
                        combo = "Si";
                    }

                    System.out.println("\n----- Factura -----");
                    System.out.println("Precio unitario: " + precio);
                    System.out.println("Subtotal: " + subtotal);
                    System.out.println("Promocion: " + promo);
                    System.out.println("Descuento: " + descuento);
                    System.out.println("Recargo: " + recargo);
                    System.out.println("Combo de cortesia: " + combo);
                    System.out.println("TOTAL A PAGAR: " + total);
                    break;

                case 2:
                    System.out.println("\nPRECIOS:");
                    System.out.println("2D = 5.00");
                    System.out.println("3D = 7.50");
                    System.out.println("IMAX = 10.00");
                    break;

                case 3:
                    System.out.println("Gracias por su visita.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 3);
        
    }
}
