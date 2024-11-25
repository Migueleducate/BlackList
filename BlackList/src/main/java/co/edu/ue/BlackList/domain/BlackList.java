package co.edu.ue.BlackList.domain;

import jakarta.persistence.*; 
import java.sql.Date;

@Entity 
@Table(name = "blacklist")
public class BlackList {
    @Id 
    @Column 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id_blacklist; 
     
    @Column 
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
