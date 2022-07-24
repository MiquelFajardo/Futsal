package UtilsES;

import java.util.Scanner;

/**
 * Biblioteca amb utilitats d'entrada i sortida
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 */
public class UtilsES {
    final static String ERROR_ENTER = "\nERROR. El valor entrat ha de ser un enter.\n";
    final static String ERROR_FORA_RANG = "\nERROR. El valor entrat està fora de rang.\n";
    
    /**
     * Mostra un menú 
     * @param titol
     * @param menu 
     */
    public void mostrarMenu(String titol, String[] menu) {
        System.out.println(titol);
        for(int i = 0; i < titol.length() + 2; i++) {
            System.out.print("=");
        }
        System.out.println();
        for(int i = 0; i < menu.length; i++) {
            System.out.println("[" + i + "] " + menu[i]);
        }
         System.out.println();
    }
    /**
     * Retorna un valor enter 2 valors
     * @param pregunta
     * @param valorMinim
     * @param valorMaxim
     * @return 
     */
    public int demanrEnter(String pregunta, int valorMinim, int valorMaxim) {
        Scanner scanner = new Scanner(System.in);
        int enterRetornar = 0;
        boolean dadaCorrecta;
        
        do {
            System.out.print(pregunta);
            dadaCorrecta = scanner.hasNextInt();
            if(dadaCorrecta) {
                enterRetornar = scanner.nextInt();
                if(enterRetornar < valorMinim || enterRetornar > valorMaxim) {
                    System.out.println(ERROR_FORA_RANG);
                    dadaCorrecta = false;
                }
            } else {
                System.out.println(ERROR_ENTER);
                scanner.next();
            }
        } while(!dadaCorrecta);
        
        return enterRetornar;
    }
    /**
     * Retorna una cadena de caràcters
     * @param pregunta
     * @return 
     */
    public String demanarString(String pregunta) {
        Scanner scanner = new Scanner(System.in);
        String cadena;
        
        System.out.print(pregunta);
        cadena = scanner.nextLine();
        
        return cadena;
    }
}
