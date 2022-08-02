package Equip;

/**
 * Classe abstracta 
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
abstract class PersonaImpl implements Persona {
    private String nom;
    private String congom1;
    private String congom2;
    private String domicili;
    private String poblacio;
    private String provincia;
    private String codiPostal;
    private String telefon;
    private String correuElectronic;
    private String dni;
    private boolean actiu;

    // Mètode constructor
    public PersonaImpl(String nom, String congom1, String congom2, String domicili, String poblacio, String provincia, String codiPostal, String telefon, String correuElectronic, String dni, boolean actiu) {
        this.nom = nom;
        this.congom1 = congom1;
        this.congom2 = congom2;
        this.domicili = domicili;
        this.poblacio = poblacio;
        this.provincia = provincia;
        this.codiPostal = codiPostal;
        this.telefon = telefon;
        this.correuElectronic = correuElectronic;
        this.dni = dni;
        this.actiu = actiu;
    }

    
    // Mètodes accessors
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCongom1() {
        return congom1;
    }
    public void setCongom1(String congom1) {
        this.congom1 = congom1;
    }

    public String getCongom2() {
        return congom2;
    }
    public void setCongom2(String congom2) {
        this.congom2 = congom2;
    }

    public String getDomicili() {
        return domicili;
    }
    public void setDomicili(String domicili) {
        this.domicili = domicili;
    }

    public String getPoblacio() {
        return poblacio;
    }
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodiPostal() {
        return codiPostal;
    }
    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCorreuElectronic() {
        return correuElectronic;
    }
    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isActiu() {
        return actiu;
    }
    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }   
}
