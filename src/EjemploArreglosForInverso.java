import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "Kingstom";
        productos[1] = "SAMSUNG";
        productos[2] = "Pastel de guayaba";
        productos[3] = "Iphone";
        productos[4] = "Ventilador";
        productos[5] = "PC";
        productos[6] = "Una empanada de la estación";



        System.out.println("  -------------------Productos------------------------------------ ");
        imprimir(productos);

        Collections.reverse(Arrays.asList(productos));

        System.out.println("  -------------------Productos Inverso------------------------------------ ");
        imprimir(productos);
    }

    static void imprimir(String[] x){
        int lasIndex = x.length;
        for(int i = 0; i < lasIndex; i++) {
            System.out.printf("productos[%d] = %s\n",i,x[i]);
        }
    }
}
