package Equip;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class Categoria {
    private String nom;    
    private List<Persona> categoria = new ArrayList<>();

    // Contstructor
    public Categoria(String nom) {
        this.nom = nom;
    }
    
    // Mètodes accessors
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Persona> getCategoria() {
        return categoria;
    }
    public void setCategoria(List<Persona> categoria) {
        this.categoria = categoria;
    }
}
