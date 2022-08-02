package Temporada;

import Equip.Categoria;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class Temporada {    
    private String anyTemporada;
    private List<Categoria> temporada = new ArrayList<>();

    // Mètode constructor
    public Temporada(String anyTemporada) {
        this.anyTemporada = anyTemporada;
    }

    // Mètodes accessors
    public String getAnyTemporada() {
        return anyTemporada;
    }
    public void setAnyTemporada(String anyTemporada) {
        this.anyTemporada = anyTemporada;
    }

    public List<Categoria> getTemporada() {
        return temporada;
    }
    public void setTemporada(List<Categoria> temporada) {
        this.temporada = temporada;
    } 
    @Override
    public String toString() {
        return anyTemporada;
    }
}
