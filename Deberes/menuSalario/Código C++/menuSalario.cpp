#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int opcion = 0, contador = 0;
    double acumulador = 0.0;
    double salarioMayor = 0.0;
    double salarioMenor = 0.0;

    // Configura la consola para mostrar siempre 2 decimales en los números flotantes
    cout << fixed << setprecision(2);

    do {
        cout << "\n===== SISTEMA DE SALARIOS =====" << endl;
        cout << "1. Registrar salarios" << endl;
        cout << "2. Mostrar resumen" << endl;
        cout << "3. Comparar un salario con el promedio" << endl;
        cout << "4. Reiniciar informacion" << endl;
        cout << "0. Salir" << endl;
        cout << "Seleccione una opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "\n*** Registro de Salarios ***" << endl;
                cout << "Ingrese los salarios (ingrese un numero negativo para terminar):" << endl;

                cout << "Salario: ";
                double salario;
                cin >> salario;

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

                    cout << "Salario: ";
                    cin >> salario;
                }
                break;

            case 2:
                cout << "\n--- Resumen de Salarios ---" << endl;
                if (contador > 0) {
                    double promedio = acumulador / contador;
                    cout << "Cantidad de salarios: " << contador << endl;
                    cout << "Total acumulado: $" << acumulador << endl;
                    cout << "Promedio de salarios: $" << promedio << endl;
                    cout << "Salario mayor: $" << salarioMayor << endl;
                    cout << "Salario menor: $" << salarioMenor << endl;
                } else {
                    cout << "No hay salarios registrados en el sistema." << endl;
                }
                break;

            case 3:
                cout << "\n--- Comparar Salario con el Promedio ---" << endl;
                if (contador > 0) {
                    double promedio = acumulador / contador;
                    cout << "Ingrese el salario a comparar: ";
                    double salarioComparar;
                    cin >> salarioComparar;

                    if (salarioComparar > promedio) {
                        cout << "El salario ingresado es MAYOR que el promedio (" << promedio << ")." << endl;
                    } else if (salarioComparar < promedio) {
                        cout << "El salario ingresado es MENOR que el promedio (" << promedio << ")." << endl;
                    } else {
                        cout << "El salario ingresado es IGUAL al promedio (" << promedio << ")." << endl;
                    }
                } else {
                    cout << "No se puede comparar porque aun no hay un promedio calculado." << endl;
                }
                break;

            case 4:
                contador = 0;
                acumulador = 0.0;
                salarioMayor = 0.0;
                salarioMenor = 0.0;
                cout << "\nDatos reiniciados correctamente." << endl;
                break;

            case 0:
                cout << "\nSaliendo del programa..." << endl;
                break;

            default:
                cout << "\nOpcion no valida. Intente de nuevo." << endl;
        }

    } while (opcion != 0);

    return 0;
}
