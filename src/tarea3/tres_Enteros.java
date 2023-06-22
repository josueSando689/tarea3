package tarea3;
import java.util.Scanner;
public class tres_Enteros {
	int entero1=0;
	int entero2=0;
	int entero3=0;
	int resultado;
	
	public static void main(String[] args) {
        tres_Enteros inicializar = new tres_Enteros();
        inicializar.obtenerNumeros();
        inicializar.calcularResultado();
        inicializar.mostrarResultado();
    }

    public void obtenerNumeros() {
        Scanner mensaje = new Scanner(System.in);

        System.out.println("Escribe un numero entero");
        if (mensaje.hasNextInt()) {
            entero1 = mensaje.nextInt();
        } else {
            System.out.println("Ese no es un numero entero");
        }

        System.out.println("Escribe otro numero entero");
        if (mensaje.hasNextInt()) {
            entero2 = mensaje.nextInt();
        } else {
            System.out.println("Ese no es un numero entero");
        }

        System.out.println("Escribe el ultimo numero entero");
        if (mensaje.hasNextInt()) {
            entero3 = mensaje.nextInt();
        } else {
            System.out.println("Ese no es un numero entero");
        }
    }

    public void calcularResultado() {
        resultado = entero1 * entero2 * entero3;
    }

    public void mostrarResultado() {
        System.out.println("El producto es " + resultado);
    }
}



