import java.awt.desktop.SystemEventListener;
import java.util.Random;

public class VideoSimpson {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;


    public static void main(String[] args) {

        // 1)Empiezo el tablero

        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        //2) Rellenar filas con L

        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = 'L';
            }

        }
        //3) Imprimir tablero
        


        //4) Asignar a bart

        Random aleatorio = new Random();
        int FilaAleatoria = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-9
        int ColumnaAleatoria = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // 0-9

        tablero[FilaAleatoria][ColumnaAleatoria] = 'B';
        // 5) imprimir tablero bart


        // 6) Repartir 10 homer dentro del tablero

        int FilaAleatoriaHomer;
        int ColumnaAleatoriaHomer;
        for (int i = 0; i < 10; i++) {
            do {
                FilaAleatoriaHomer = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-9
                ColumnaAleatoriaHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // 0-9
            } while (tablero[FilaAleatoriaHomer][ColumnaAleatoriaHomer] != 'L');
            // tablero[FilaAleatoriaHomer][ColumnaAleatoriaHomer] != 'L'
            tablero[FilaAleatoriaHomer][ColumnaAleatoriaHomer] = 'H';
        }
        // 7) Repartir 10 Muros dentro del tablero
        int FilaAleatoriaMuro;
        int ColumnaAleatoriaMuro;
        for (int i = 0; i < 10; i++) {
            do {
                FilaAleatoriaMuro = aleatorio.nextInt(MAX_FILA_TABLERO); // 0-9
                ColumnaAleatoriaMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO); // 0-9
            } while (tablero[FilaAleatoriaMuro][ColumnaAleatoriaMuro] != 'L');

            tablero[FilaAleatoriaMuro][ColumnaAleatoriaMuro] = 'M';
        }

        tablero[MAX_FILA_TABLERO-1] [MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
    }
    private static void imprimirTablero() {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");


    }
}








