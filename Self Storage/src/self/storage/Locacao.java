/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.storage;

/**
 *
 * @author User
 */
public class Locacao {
    
    private Client cliente;
    private Garage garagem;

    public Locacao(Client cliente, Garage garagem) {
        this.cliente = cliente;
        this.garagem = garagem;
    }
    public Client getCliente() {
        return cliente;
    }
    public Garage getGaragem() {
        return garagem;
    }

    
}
