/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package album_mundial_201701133;

/**
 *
 * @author Aragon Perez
 */
public class Nodo_Jugador_201701133 {
    public Integer NoCamisola;
    public Integer idequipo;
    public String Posicion;
    public String Nombre;
    public String TitularoBanca;
    
    Nodo_Jugador_201701133 siguiente;
    Nodo_Jugador_201701133 anterior;
    
    
    public Nodo_Jugador_201701133(String Nm,int No ,String pos, String tob, int ideq) {
        this.NoCamisola=No;
        this.Posicion=pos;
        this.Nombre=Nm;
        this.TitularoBanca=tob;
        this.idequipo=ideq;
        this.anterior=null;
        this.siguiente=null;
    }
}
