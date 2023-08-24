/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.newpackage;

/**
 *
 * @author Aluno
 */
public class Computador {
   private String memoria;
   private String processador;
   private int capacidadeDiscoRígido;
   private String operacional;

    public Computador(String memoria, String processador, int capacidadeDiscoRígido, String operacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRígido = capacidadeDiscoRígido;
        this.operacional = operacional;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getCapacidadeDiscoRígido() {
        return capacidadeDiscoRígido;
    }

    public void setCapacidadeDiscoRígido(int capacidadeDiscoRígido) {
        this.capacidadeDiscoRígido = capacidadeDiscoRígido;
    }

    public String getOperacional() {
        return operacional;
    }

    public void setOperacional(String operacional) {
        this.operacional = operacional;
    }
   
   @Override

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoR\u00edgido=" + capacidadeDiscoRígido + ", operacional=" + operacional + '}';
    }
   
}
