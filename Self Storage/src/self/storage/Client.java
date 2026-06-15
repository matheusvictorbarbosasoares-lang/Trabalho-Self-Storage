/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package self.storage;

/**
 *
 * @author User
 */
public class Client {
    
    private String nome;
    private String cpf;
    private String telefone;
    
    public Client(String nome, String cpf, String telefone) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
      public String getCpf() {
        return cpf;
    }
     public String getTelefone() {
        return telefone;
    }
}
