/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publicidade;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[]args){
        Post primeiroPost = new Post("teste", "testando");
        Post segundoPost = new Post("post oficial", "oficial");
        Post terceiroPost = new Post("descarte", "descartado");
        
        primeiroPost.comum();
        primeiroPost.comum();
        primeiroPost.comum();
        primeiroPost.comum();
        primeiroPost.legal();
        primeiroPost.legal();
        primeiroPost.superLegal();
        primeiroPost.superLegal();
        primeiroPost.superLegal();
        
        segundoPost.comum();
        segundoPost.comum();
        segundoPost.comum();
        segundoPost.comum();
        segundoPost.legal();
        segundoPost.legal();
        segundoPost.superLegal();
        segundoPost.superLegal();
        
        terceiroPost.comum();
        terceiroPost.comum();
        terceiroPost.legal();
        terceiroPost.legal();
        terceiroPost.superLegal();
        
        System.out.println(primeiroPost);
        System.out.println(segundoPost);
        System.out.println(terceiroPost);
        
    }
}
