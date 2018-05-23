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
public class Lista_Usuarios_201701133 {
    Nodo_Usuario_201701133 Inicio;
    Nodo_Usuario_201701133 Fin;
    //constructor
    public Lista_Usuarios_201701133() {
        this.Inicio=null;
        this.Fin=null;
    }
    //ver si la lista esta vacia
    private boolean Vacia(){
        boolean vacio=false;
        if(Inicio==null){
            vacio=true;
        }
        return vacio;
    }
    //fin funcion de verificacion vacio
    private void enlazar (Nodo_Usuario_201701133 Nodoa, Nodo_Usuario_201701133 Nodob){
        Nodoa.siguiente=Nodob;
        Nodob.anterior=Nodoa;
    }
    //insertar un usuario
    public void Insertar_Usuario(int Cu, String Nm, String crr, String Usu, String Pass){
        Nodo_Usuario_201701133 nuevo=new Nodo_Usuario_201701133(Cu,Nm,crr,Usu,Pass);
        if(Vacia()){
            Inicio=nuevo;
            Fin=nuevo;
        }else{
            enlazar(nuevo, Inicio);
            Inicio=nuevo;
        }
    }
    //Buscar
    public Nodo_Usuario_201701133 Buscar(String Usu){
        Nodo_Usuario_201701133 buscado=null;
        Nodo_Usuario_201701133 iterador=Inicio;
        while((buscado== null )&&(iterador!=null)){
            if(iterador.Usuario.equals(Usu)){
                buscado=iterador;
            }
            iterador=iterador.siguiente;
        }
        return buscado;
    }
    
    public boolean BuscarUsu(String Usu){
        Nodo_Usuario_201701133 iterador=Inicio;
        boolean a=false;
        while(iterador!=null){
            if(Usu.equals(iterador.Usuario)){
                a=true;
                return a;
            }
            iterador=iterador.siguiente;
        }
        return a; 
    }

    public Nodo_Usuario_201701133 Eliminar(String Usu){
        Nodo_Usuario_201701133 buscado=null;
        Nodo_Usuario_201701133 iterador=Inicio;
        while((buscado== null )&&(iterador!=null)){
            if(iterador.Usuario.equals(Usu)){
                buscado=iterador;
                iterador.Usuario="";
            }
            iterador=iterador.siguiente;
        }
        return buscado;
    }
    //mostrar todos los usuarios
    public void mostrar(){
        Nodo_Usuario_201701133 iterador=Inicio;
        while(iterador!=null){
            if(iterador.Usuario.equals("")){
            }else{
                System.out.println(iterador.Usuario+"  "+iterador.password);
                iterador=iterador.siguiente;
            }
            
        }
    }
    
}
