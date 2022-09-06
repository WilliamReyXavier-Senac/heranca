/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author willian.xavier
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Automovel carro = new Automovel();
       Automovel moto = new Automovel();
       
       carro.setNumPlaca("BIG123");
       carro.setNumPortas(3);
       carro.setNumRodas(4);
       carro.setCapacidade(2);
       carro.imprimirCarro();
       
       
    }
    
}
