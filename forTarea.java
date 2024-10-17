import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntrada, resultado = 0;
        
        System.out.print("Ingrese el numero que desea calcular: ");
        numeroEntrada = scanner.nextInt();
        
        // Usando for en lugar de while
        for (int i = 0; i <= numeroEntrada; i++) {
            resultado += i;
        }
        
        System.out.println("La suma de los primeros " + numeroEntrada + " naturales es igual a " + resultado);
        
        scanner.close();
    }
}