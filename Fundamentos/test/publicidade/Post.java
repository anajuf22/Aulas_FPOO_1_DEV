/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicidade;

/**
 *
 * @author Aluno
 */
public class Post implements Estrelas{
  private String titulo;
  private String descricao;
  private int estrelas;

    public Post(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.estrelas = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEstrelas() {
        return estrelas;
    }

    @Override
    public String toString() {
        return "Post{" + "titulo=" + titulo + ", descricao=" + descricao + ", estrelas=" + estrelas + '}';
    }

    @Override
    public void comum() {
       this.estrelas += 1; 
        System.out.println("Post comum");
    }

    @Override
    public void legal() {
        this.estrelas += 3; 
        System.out.println("Post legal");
    }

    @Override
    public void superLegal() {
        this.estrelas += 5; 
        System.out.println("Post super legal");
            }
  
 
}
