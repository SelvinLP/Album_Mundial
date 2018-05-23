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
public class Nodo_Equipo_201701133 {
    public Integer id;
    public String Nombre;
    public int mudgn;
    
    Nodo_Equipo_201701133 siguiente;
    Nodo_Equipo_201701133 anterior;

    public Nodo_Equipo_201701133(int ida,String nm,int mud) {
        this.siguiente=null;
        this.anterior=null;
        this.id=ida;
        this.Nombre=nm;
        this.mudgn=mud;
    }
    
}
