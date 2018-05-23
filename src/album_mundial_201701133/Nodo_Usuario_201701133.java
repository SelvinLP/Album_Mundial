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
public class Nodo_Usuario_201701133 {
    public Integer cui;
    public String Correo;
    public String Nombre;
    public String Usuario;
    public String password;
    
    Nodo_Usuario_201701133 siguiente;
    Nodo_Usuario_201701133 anterior;
    
    
    public Nodo_Usuario_201701133(int Cu, String Nm, String crr, String Usu, String Pass) {
        this.cui=Cu;
        this.Correo=crr;
        this.Nombre=Nm;
        this.Usuario=Usu;
        this.password=Pass;
        this.anterior=null;
        this.siguiente=null;
    }

}
