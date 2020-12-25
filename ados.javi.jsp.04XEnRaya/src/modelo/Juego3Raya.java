/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javi
 */
public class Juego3Raya {

    final static int EN_BLANCO = 0;
    final static int JUG1 = 1;
    final static int JUG2 = 2;

    private int filaOrigen;
    private int colOrigen;

    //Situacion del juego en cada instante
    private int[][] tablero;

    //quien es el siguiente que juega
    private int jugadorActual;

    //quitn ha ganado
    private int jugadorGanador;

    //Piezas que faltan por poner en juego
    private int[] pendientesColocar;

    public Juego3Raya() {
        super();
    }
    public int getFilaOrigen(){
        return filaOrigen;
    }
    public int getColOrigen(){
        return colOrigen;
    }
    public void setTamanyo(int tamanyo) {
        tablero = new int[tamanyo][tamanyo];
        jugadorActual = JUG1;
        pendientesColocar = new int[]{0, tamanyo, tamanyo};
        jugadorGanador = EN_BLANCO;
        filaOrigen = -1;
        colOrigen = -1;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public int getJugadorActual() {
        return jugadorActual;
    }

    public int getPendientesColocar(int jugador) {
        return pendientesColocar[jugador];
    }

    private void cambiarJugadorActual() {
        if (jugadorActual == JUG1) {
            jugadorActual = JUG2;
        } else {
            jugadorActual = JUG1;
        }
    }

    public boolean sePuedeMover(int jugador, int desdeFila, int desdeCol, int hastaFila, int hastaCol) {

        if (isFinPartida()) {
            return false;
        }
        if (getPendientesColocar(jugador) > 0) {
            return false;
        }
        if (tablero[desdeFila][desdeCol] != jugador) {
            return false;
        }

        return (tablero[hastaFila][hastaCol] == EN_BLANCO);
    }

    public boolean mover(int fila, int columna) {
        if (isFinPartida()) {
            return false;
        }

        if (getPendientesColocar(jugadorActual) > 0) {
            if (tablero[fila][columna] != EN_BLANCO) {
                return false;
            } else {
                tablero[fila][columna] = jugadorActual;
                pendientesColocar[jugadorActual]--;
                setGanador(jugadorActual, fila, columna);
                cambiarJugadorActual();
                return true;
            }
        } else {
            if (filaOrigen == -1) {
                //Inicio del movimiento
                if (tablero[fila][columna] != jugadorActual) {
                    return false;
                } else {
                    filaOrigen = fila;
                    colOrigen = columna;
                    return true;
                }
            } else {
                boolean res =  mover(filaOrigen,colOrigen,fila,columna);
                if(res){
                    filaOrigen = -1;
                    colOrigen = -1;
                }
                return res;
            }
        }

    }

    public boolean mover(int desdeFila, int desdeColumna, int hastaFila, int hastaColumna) {
        if (sePuedeMover(jugadorActual, desdeFila, desdeColumna, hastaFila, hastaColumna)) {
            tablero[desdeFila][desdeColumna] = EN_BLANCO;
            tablero[hastaFila][hastaColumna] = jugadorActual;
            setGanador(jugadorActual, hastaFila, hastaColumna);
            cambiarJugadorActual();
            return true;
        } else {
            return false;
        }
    }

    private void setGanador(int jugador, int fila, int col) {
        //Comprobamos si toda la fila es del jugador
        boolean enc = false;
        for (int j = 0; j < tablero.length && !enc; j++) {
            if (tablero[fila][j] != jugador) {
                enc = true;
            }
        }
        if (!enc) {
            jugadorGanador = jugador;
        }

        if (jugadorGanador == EN_BLANCO) {

            //Comprobamos si toda la columna es del jugador
            enc = false;
            for (int i = 0; i < tablero.length && !enc; i++) {
                if (tablero[i][col] != jugador) {
                    enc = true;
                }
            }
            if (!enc) {
                jugadorGanador = jugador;
            }
        }
        if (jugadorGanador == EN_BLANCO && fila == col) {
            //Una diagonal
            enc = false;
            for (int i = 0; i < tablero.length && !enc; i++) {
                if (tablero[i][i] != jugador) {
                    enc = true;
                }
            }
            if (!enc) {
                jugadorGanador = jugador;
            }
        }
        if (jugadorGanador == EN_BLANCO && col == tablero.length-1-fila) {
            //La otra diagonal
            enc = false;
            for (int i = 0; i < tablero.length && !enc; i++) {
                if (tablero[i][tablero.length-1-i] != jugador) {
                    enc = true;
                }
            }
            if (!enc) {
                jugadorGanador = jugador;
            }
        }
    }

    public boolean isFinPartida() {
        return jugadorGanador != EN_BLANCO;
    }

    public int getJugadorGanador() {
        return jugadorGanador;
    }

}
