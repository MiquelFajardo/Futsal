package Equip;

/**
 *
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class EquipTecnic extends PersonaImpl {
    private String carrec;
 
    // Constructor
    public EquipTecnic(String carrec, String nom, String congom1, String congom2, String domicili, String poblacio, String provincia, String codiPostal, String telefon, String correuElectronic, String dni, boolean actiu) {
        super(nom, congom1, congom2, domicili, poblacio, provincia, codiPostal, telefon, correuElectronic, dni, actiu);
        this.carrec = carrec;
    }

    // Mètodes accessors
    public String getCarrec() {
        return carrec;
    }
    public void setCarrec(String carrec) {
        this.carrec = carrec;
    }

    
}
