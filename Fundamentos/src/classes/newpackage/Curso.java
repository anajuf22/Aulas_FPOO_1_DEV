/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.newpackage;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;

    public Curso(String nome, String descricao, CategoriaEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }
    
    @Override

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }
    

    
}
