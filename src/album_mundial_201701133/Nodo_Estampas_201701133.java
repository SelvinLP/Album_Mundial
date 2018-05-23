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
public class Nodo_Estampas_201701133 {
    public Integer rareza;
    public String ruta;
    public String Nombre;
    public String equipo;
    
    Nodo_Estampas_201701133 siguiente;
    Nodo_Estampas_201701133 anterior;

    public Nodo_Estampas_201701133(String nom,String equi,int rar,String url) {
        this.siguiente=null;
        this.anterior=null;
        this.Nombre=nom;
        this.equipo=equi;
        this.ruta=url;
        this.rareza=rar;
      
    }
    
}
