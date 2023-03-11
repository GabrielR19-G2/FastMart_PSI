/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author EDW
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id_administrador")
public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nombre, String direccion, String telefono, String email, String password) {
        super(nombre, direccion, telefono, email, password);
    }

    public Administrador(Long id, String nombre, String direccion, String telefono, String email, String password) {
        super(id, nombre, direccion, telefono, email, password);
    }
    
}
