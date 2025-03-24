import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import com.formacom.Numeros;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        
        System.out.println("Ingrese 5 números:");
        
        int contador = 0;
        while (contador < 5) {
            try {
                System.out.print("Número " + (contador + 1) + ": ");
                int numero = scanner.nextInt();
                listaNumeros.add(numero);
                contador++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero. Intente nuevamente.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        Numeros numeros = new Numeros(listaNumeros);
        
        System.out.println("El número menor es: " + numeros.menor());
        System.out.println("El número mayor es: " + numeros.mayor());
        System.out.println("Los números pares son: " + numeros.pares());
        System.out.println("Los números impares son: " + numeros.impares());
        
        scanner.close();
    }
}
