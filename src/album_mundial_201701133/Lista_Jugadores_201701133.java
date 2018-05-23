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
public class Lista_Jugadores_201701133 {
    Nodo_Jugador_201701133 Inicio;
    Nodo_Jugador_201701133 Fin;

    public Lista_Jugadores_201701133() {
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
     private void enlazar (Nodo_Jugador_201701133 Nodoa, Nodo_Jugador_201701133 Nodob){
        Nodoa.siguiente=Nodob;
        Nodob.anterior=Nodoa;
    }
    //insertar un usuario
    public void Insertar_Jugador(String Nm,int No, String pos, String tob, int ide){
        Nodo_Jugador_201701133 nuevo=new Nodo_Jugador_201701133(Nm,No,pos,tob,ide);
        if(Vacia()){
            Inicio=nuevo;
            Fin=nuevo;
        }else{
            enlazar(nuevo, Inicio);
            Inicio=nuevo;
        }
    }
    public Nodo_Jugador_201701133 Buscar(String nombre){
        Nodo_Jugador_201701133 buscado=null;
        Nodo_Jugador_201701133 iterador=Inicio;
        while((buscado== null )&&(iterador!=null)){
            if(iterador.Nombre.equals(nombre)){
                buscado=iterador;
            }
            iterador=iterador.siguiente;
        }
        return buscado;
    }
     public void mostrar(){
        Nodo_Jugador_201701133 iterador=Inicio;
        while(iterador!=null){
            if(iterador.Nombre.equals("")){
            }else{
                System.out.println(iterador.Nombre);
                iterador=iterador.siguiente;
            }
            
        }
    }
    
}
