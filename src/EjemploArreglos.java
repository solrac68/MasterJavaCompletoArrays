import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Kingstom";
        productos[1] = "SAMSUNG";
        productos[2] = "Pastel de guayaba";
        productos[3] = "Iphone";
        productos[4] = "Ventilador";
        productos[5] = "PC";
        productos[6] = "Una empanada de la estación";

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        Arrays.sort(productos);
        System.out.println("  -------------------Productos Ordenados------------------------------------ ");
        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

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
}
