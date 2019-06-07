/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocoche;

/**
 *
 * @author Admin
 */
public class ProyectoCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche_abuelo=new Coche();
        coche_abuelo.setMarca("Renault");
        coche_abuelo.setModelo("12");
        coche_abuelo.setPotencia(60);
        coche_abuelo.setMatricula("M5564J");
        System.out.println(coche_abuelo);//Si sobreescribo toString
        System.out.println("Marca: "+coche_abuelo.getMarca()+
                " Modelo: "+coche_abuelo.getModelo());
        Coche coche_hermana=new Coche();
        coche_hermana.setMarca("Ford");
        coche_hermana.setModelo("Focus");
        coche_hermana.setPotencia(90);
        System.out.println("Marca: "+coche_hermana.getMarca()+
                " Modelo: "+coche_hermana.getModelo());
    }
    
    
    
}
