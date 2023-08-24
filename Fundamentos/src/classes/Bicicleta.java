/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    
    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdemarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situação;
    
    //construtor sem argumentos
    public Bicicleta() {
    }
    
    //contrutor com argumnetos

    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdemarchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdemarchas = qtdemarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
    }
    
    //Ações da bicicleta
    public void andar() {
        System.out.println("Bicicleta andando");
    }
    
    public boolean verificarFreio() {
        return this.temFreio;
    }
    
    
    
    
}
