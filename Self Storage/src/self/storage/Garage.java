/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.storage;

/**
 *
 * @author User
 */
public class Garage {
    
    private double valorMensal;
    private int numero;
    private boolean disponivel;
    
    public Garage(int numero, double valorMensal) {
        
        this.valorMensal = valorMensal;
        this.numero = numero;
        this.disponivel = true;
    }
     public int getNumero() {
        return numero;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
