package futsal;

import UtilsES.UtilsES;

/**
 *
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class Club {
    UtilsES utilsES;
    
    private String nom;
    private String domicili;
    private String poblacio;
    private String provincia;
    private String codiPostal;
    private String telefon;
    private String correuElectronic;
    private String web;
    
    // Constructor
    public Club(String nom, String domicili, String poblacio, String provincia, String codiPostal, String telefon, String correuElectronic, String web) {
        this.nom = nom;
        this.domicili = domicili;
        this.poblacio = poblacio;
        this.provincia = provincia;
        this.codiPostal = codiPostal;
        this.telefon = telefon;
        this.correuElectronic = correuElectronic;
        this.web = web;
    }
    
    // Mètodes accessors
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
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

    public String getWeb() {
        return web;
    }
    public void setWeb(String web) {
        this.web = web;
    }  
    
    /**
     * Mostra les dades del club
     */
    public void veureDadesClub() {
        System.out.println("\nDADES DEL CLUB\n");
        System.out.println("Nom: " + this.nom);
        System.out.println("Domicili: " + this.domicili);
        System.out.println("Població: (" + this.codiPostal + ") " + this.poblacio + " - " + this.provincia);
        System.out.println("Telèfon: " + this.telefon);
        System.out.println("Correu electrònic: " + this.correuElectronic);
        System.out.println("Web: " + this.web + "\n");
    }
}
