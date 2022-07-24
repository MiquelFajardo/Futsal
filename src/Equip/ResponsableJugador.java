package Equip;

/**
 * Persona responsable d'un jugador (pare, mare o tutor legal)
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class ResponsableJugador extends PersonaImpl {

    // Constructor
    public ResponsableJugador(String nom, String congom1, String congom2, String domicili, String poblacio, String provincia, String codiPostal, String telefon, String correuElectronic, String dni, boolean actiu) {
        super(nom, congom1, congom2, domicili, poblacio, provincia, codiPostal, telefon, correuElectronic, dni, actiu);
    }
    
}
