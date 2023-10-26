import java.util.Scanner;

public class App {
    public static int obtenerEntrada(){
        Scanner Scanner = new Scanner(System.in);
        int valor = Scanner.nextInt();
        System.out.println("ingrese un valor");
        return valor;
    }


    public static void generarValores() {
        int n = obtenerEntrada();
        for (n = 1; n <= n; n++)
            System.out.println(n);
        }

    public static void generarValoresPares() {
        int n = obtenerEntrada();
        for (n = 1; n <= n; n++)
            if (n % 2 == 0) {
                System.out.println(n);
            }
    }

    public static void generarRandom() {
        int n = (int) (Math.random() * 3500);
            for (int i = 1; i <= n; i += 5) {System.out.println(i);
                     }
        }
}





