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
public class Automovel extends Terrestre {

    private String numPlaca;
    private int numPortas;

    public void imprimirCarro() {
        System.out.println("Placa: " + numPlaca + "\nNúmero portas: " + numPortas);
        System.out.println("Número de rodas: " + numRodas + "\nCapacidade: " + capacidade);
    }

    public void imprimirMoto() {
        System.out.println("Placa: " + numPlaca);
        System.out.println("Número de rodas: " + numRodas + "\nCapacidade: " + capacidade);
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
