package futsal;

import UtilsES.UtilsES;

/**
 * Aplicació per portar el control d'un equip de futbol sala
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class FutSal {
    final static int SORTIR = 0;
    
    final static String TRIA_OPCIO = "Selecciona una opció: ";
    final static String OPCIO_NO_VALIDA = "\nERROR. Opció de menú no vàlida. Contacti amb el desatrotllador.\n";
    
    private static Club club;
    
    UtilsES utilsES;
    
    public static void main(String[] args) {
        FutSal futSal = new FutSal();
        futSal.inici();
    }
    private void inici() {
        utilsES = new UtilsES();
        int opcio;
        String[] menu = {
            "Sortir",
            "Dades del club",
            "Temporada"
        };
        
        // Dades de prova // BORRAR
        club = new Club("CFS Porqueres", "Montseny s/n", "Porqueres", "Girona", "17834", "972581807", "info@cfsporqueres.cat", "www.cfsporqueres.cat"); 
        
        if(club == null) {
            System.out.println("Club no inicialitzat. Entra les dades\n");     
            altaDadesClub();
        }
        
        do {
            utilsES.mostrarMenu("Menú principal", menu);
            opcio = utilsES.demanrEnter(TRIA_OPCIO, SORTIR, menu.length -1);
            switch(opcio) {
                case 1:     // Dades del club
                    dadesClub();
                    break;  
                case 2:     // Temporada
                    break;
                case SORTIR:                    
                    break;
                default:
                    System.out.println(OPCIO_NO_VALIDA);
                    
            }
        } while(opcio != SORTIR);
    }
    /**
     * Veure, modificar dades del club
     */
    public void dadesClub() {
        utilsES = new UtilsES();
        int opcio;
        String[] menu = {
            "Tornar menú principal",
            "Veure les dades",
            "Modificar dades"
        };
        
        do {
            utilsES.mostrarMenu("Dades del club", menu);
            opcio = utilsES.demanrEnter(TRIA_OPCIO, SORTIR, menu.length -1);
            switch(opcio) {
                case 1:
                    club.veureDadesClub();
                    break;
                case 2:
                    modificarDadesClub();
                    break;
                case SORTIR:                    
                    break;
                default:
                    System.out.println(OPCIO_NO_VALIDA);                
            }
        } while(opcio != SORTIR);
    }
    /**
     * Donar d'alta un club
     */
    public void altaDadesClub() {
        utilsES = new UtilsES();
        
        System.out.println("\nALTA DADES DEL CLUB\n\n-Enter per dades buides -\n");
        
        String nom = utilsES.demanarString("Nom: ");              
        String domicili = utilsES.demanarString("Domicili: ");
        String poblacio = utilsES.demanarString("Població: ");         
        String provincia = utilsES.demanarString("Provincia: ");       
        String codiPostal = utilsES.demanarString("Codi postal: ");            
        String telefon = utilsES.demanarString("Telèfon: ");             
        String correuElectronic = utilsES.demanarString("Correu electrónic: ");                
        String web = utilsES.demanarString("Web: ");   
        
        club = new Club(nom, domicili, poblacio, provincia, codiPostal, telefon, correuElectronic, web);
    }
    /**
    * Modificar dades del club
    */
    public void modificarDadesClub() {
        utilsES = new UtilsES();       
        
        System.out.println("\nMODIFICAR DADES DEL CLUB\n\n-Enter per no canviar les dades -\n");
        
        String nom = utilsES.demanarString("Nom (" + club.getNom() + "): ");
        if(!nom.isEmpty()) club.setNom(nom);
        
        String domicili = utilsES.demanarString("Domicili (" + club.getDomicili() + "): ");
        if(!domicili.isEmpty()) club.setDomicili(domicili);
        
        String poblacio = utilsES.demanarString("Població (" + club.getPoblacio() + "): ");
        if(!poblacio.isEmpty()) club.setPoblacio(poblacio);
        
        String provincia = utilsES.demanarString("Provincia (" + club.getProvincia() + "): ");
        if(!provincia.isEmpty()) club.setProvincia(provincia);
     
        String codiPostal = utilsES.demanarString("Codi postal (" + club.getCodiPostal() + "): ");
        if(!codiPostal.isEmpty()) club.setCodiPostal(codiPostal);
        
        String telefon = utilsES.demanarString("Telèfon (" + club.getTelefon() + "): ");
        if(!telefon.isEmpty()) club.setTelefon(telefon);
        
        String correuElectronic = utilsES.demanarString("Correu electrónic (" + club.getCorreuElectronic() + "): ");
        if(!correuElectronic.isEmpty()) club.setCorreuElectronic(correuElectronic);
        
        String web = utilsES.demanarString("Web (" + club.getWeb() + "): ");
        if(!web.isEmpty()) club.setWeb(web);
    }
    
}
