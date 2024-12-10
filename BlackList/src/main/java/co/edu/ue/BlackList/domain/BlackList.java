package co.edu.ue.BlackList.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "blacklist")
public class BlackList {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_blacklist")
    private int id_blacklist; 
    
    @Column(name = "nombre")
    private String nombre;
    
    ////////////////////////////////////////////

    public int getId_blacklist() {
        return id_blacklist;
    }

    public void setId_blacklist(int id_blacklist) {
        this.id_blacklist = id_blacklist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
