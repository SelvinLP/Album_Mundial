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
public class Lista_Equipo_201701133 {
    Nodo_Equipo_201701133 Inicio;
    Nodo_Equipo_201701133 Fin;

    public Lista_Equipo_201701133() {
        this.Inicio=null;
        this.Fin=null;
    }
    private boolean Vacia(){
        boolean vacio=false;
        if(Inicio==null){
            vacio=true;
        }
        return vacio;
    }
    private void enlazar (Nodo_Equipo_201701133 Nodoa, Nodo_Equipo_201701133 Nodob){
        Nodoa.siguiente=Nodob;
        Nodob.anterior=Nodoa;
    }
    public void Insertar_Usuario(int ida,String nm,int mud){
        Nodo_Equipo_201701133 nuevo=new Nodo_Equipo_201701133(ida,nm,mud);
        if(Vacia()){
            Inicio=nuevo;
            Fin=nuevo;
        }else{
            enlazar(nuevo, Inicio);
            Inicio=nuevo;
        }
    }
    
}
