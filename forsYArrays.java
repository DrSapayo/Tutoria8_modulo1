import java.util.Scanner;

public class forsYArrays {

    static Scanner sc = new Scanner(System.in);

    

    public static void main(String[] args) {

        System.out.print("Digite cuantos puntajes desea almacenar: ");
        int espacios = sc.nextInt();

        int puntajes[] = new int[espacios]; //array o arreglo

        registrarPuntajes(puntajes);

        mostrarPuntajes(puntajes);

        int total = calcularTotal(puntajes);
        System.out.println("Total de puntos: " + total);

        int mayor = obtenerMayor(puntajes);
        System.out.println("Puntaje más alto: " + mayor);

        double promedio = obtenerPromedio(puntajes);
        System.out.print("El promedio de los puntajes fue: " + promedio);
    }

    //ALMACENAR PUNTAJES

    public static void registrarPuntajes(int datos[]){

        for(int i = 0; i < datos.length ;i++){

            System.out.print("\nIngrese la puntuacion "+(i+1)+" : ");
            datos[i] = sc.nextInt();

        }

    }

    //IMPRIMIR PUNTAJES

    public static void mostrarPuntajes(int[] datos){

        for(int i = 0; i < datos.length ;i++){

            System.out.println("Puntuacion "+(i+1)+" : " + datos[i]);

        }

    }

    //SUMAR PUNTAJES

    public static int calcularTotal(int[] datos){

        int suma = 0;

        for(int i = 0; i < datos.length ;i++){

            suma += datos[i];

        }
        return suma;
    }

    //COMPARAR E IMPRIMIR EL MAYOR
    
    public static int obtenerMayor(int[] datos){

        int mayor = datos[0];

        for(int i = 1; i < datos.length ;i++){

            if(mayor<datos[i]){
                mayor = datos[i];
                
            }
        }

        return mayor;
    }

    //CALCULAR EL PROMEDIO DE LOS PUNTAJES

    public static double obtenerPromedio(int[] datos){
        double promedio = 0.0;

        promedio = calcularTotal(datos) / ((double)datos.length);
        
        return promedio;
    }

}