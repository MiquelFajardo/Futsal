package Equip;

import java.util.Date;

/**
 * Jugador del club
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class Jugador extends PersonaImpl {
    private Date dataNaixament;  

    // Constructor
    public Jugador(Date dataNaixament, String nom, String congom1, String congom2, String domicili, String poblacio, String provincia, String codiPostal, String telefon, String correuElectronic, String dni, boolean actiu) {
        super(nom, congom1, congom2, domicili, poblacio, provincia, codiPostal, telefon, correuElectronic, dni, actiu);
        this.dataNaixament = dataNaixament;
    }
  
    
    // Mètodes accessors 
    public Date getDataNaixament() {
        return dataNaixament;
    }
    public void setDataNaixament(Date dataNaixament) {
        this.dataNaixament = dataNaixament;
    }

}
