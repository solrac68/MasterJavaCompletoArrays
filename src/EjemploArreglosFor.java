import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];

        System.out.println("-------------------Productos------------------------------------ ");
        imprimir(productos);

        productos[0] = "Kingstom";
        productos[1] = "SAMSUNG";
        productos[2] = "Pastel de guayaba";
        productos[3] = "Iphone";
        productos[4] = "Ventilador";
        productos[5] = "PC";
        productos[6] = "Una empanada de la estación";

        System.out.println("  -------------------Productos------------------------------------ ");
        imprimir(productos);

        Arrays.sort(productos);

        System.out.println("  -------------------Productos Ordenados------------------------------------ ");
        imprimir(productos);

        int[] numeros = new int[4];

        numeros[0] = 0;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int)3L;
        numeros[3] = -1;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        System.out.println("  --------------------Numeros Ordenados----------------------- ");

        Arrays.sort(numeros);
        i = numeros[0];
        j = numeros[1];
        k = numeros[2];
        l = numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }

    static void imprimir(String[] x){
        int lasIndex = x.length;
        for(int i = 0; i < lasIndex; i++) {
            System.out.printf("productos[%d] = %s\n",i,x[i]);
        }
    }
}
