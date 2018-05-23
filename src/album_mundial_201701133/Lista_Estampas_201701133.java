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
public class Lista_Estampas_201701133 {
    Nodo_Estampas_201701133 Inicio;
    Nodo_Estampas_201701133 Fin;

    public Lista_Estampas_201701133() {
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
    private void enlazar (Nodo_Estampas_201701133 Nodoa, Nodo_Estampas_201701133 Nodob){
        Nodoa.siguiente=Nodob;
        Nodob.anterior=Nodoa;
    }
    public void Insertar_Estampa(String nom,String equi,int rar,String url){
        Nodo_Estampas_201701133 nuevo=new Nodo_Estampas_201701133(nom,equi,rar,url);
        if(Vacia()){
            Inicio=nuevo;
            Fin=nuevo;
        }else{
            enlazar(nuevo, Inicio);
            Inicio=nuevo;
        }
    }
     public Nodo_Estampas_201701133 Buscar(String nm){
        Nodo_Estampas_201701133 buscado=null;
        Nodo_Estampas_201701133 iterador=Inicio;
        while((buscado== null )&&(iterador!=null)){
            if(iterador.Nombre.equals(nm)){
                buscado=iterador;
            }
            iterador=iterador.siguiente;
        }
        return buscado;
    }
    public void mostrar(){
        Nodo_Estampas_201701133 iterador=Inicio;
        while(iterador!=null){
            if(iterador.Nombre.equals("")){
            }else{
                System.out.println(iterador.Nombre);
                iterador=iterador.siguiente;
            }
            
        }
    }
}
