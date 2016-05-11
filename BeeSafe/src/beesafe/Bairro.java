/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beesafe;

/**
 *
 * @author Clark
 */
public class Bairro {
    private String nomeBairro;
    private Regiao regiao;

    public Bairro(String nome, Regiao regiao) {
        this.nomeBairro = nome;
        this.regiao = regiao;
    }
    
    public String getNome() {
        return nomeBairro;
    }

    public String getRegiao() {
        return regiao.getNome();
    }   
    
    @Override
    public String toString(){
         return this.getNome() + " - " + this.getRegiao();
    }
}
