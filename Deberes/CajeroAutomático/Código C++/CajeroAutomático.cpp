#include <iostream> 

#include <iomanip> 

  

using namespace std; 

  

int main() { 

    double saldo = 1000.00; 

    double cantidad; 

    int opcion; 

  

    cout << fixed << setprecision(2); 

  

    cout << "===== CAJERO AUTOMÁTICO =====" << endl; 

    cout << "1. Depositar" << endl; 

    cout << "2. Retirar" << endl; 

    cout << "3. Mostrar saldo" << endl; 

    cout << "4. Salir" << endl; 

    cout << "Seleccione una opción: "; 

    cin >> opcion; 

  

    switch (opcion) { 

        case 1: 

            cout << "Ingrese la cantidad a depositar: "; 

            cin >> cantidad; 

            if (cantidad > 0) { 

                saldo += cantidad; 

                cout << "Depósito realizado correctamente." << endl; 

                cout << "Nuevo saldo: $" << saldo << endl; 

            } else { 

                cout << "La cantidad debe ser mayor que 0." << endl; 

            } 

            break; 

  

        case 2: 

            cout << "Ingrese la cantidad a retirar: "; 

            cin >> cantidad; 

            if (cantidad > 0 && cantidad <= saldo) { 

                saldo -= cantidad; 

                cout << "Retiro realizado correctamente." << endl; 

                cout << "Nuevo saldo: $" << saldo << endl; 

            } else if (cantidad > saldo) { 

                cout << "Saldo insuficiente." << endl; 

            } else { 

                cout << "La cantidad debe ser mayor que 0." << endl; 

            } 

            break; 

  

        case 3: 

            cout << "Su saldo actual es: $" << saldo << endl; 

            break; 

  

        case 4: 

            cout << "Gracias por utilizar el cajero automático." << endl; 

            break; 

  

        default: 

            cout << "Opción no válida." << endl; 

            break; 

    } 

  

    return 0; 

} 
