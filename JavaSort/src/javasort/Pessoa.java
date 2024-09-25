/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.time.LocalDate;

/**
 *
 * @author 15385404608
 */
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    
    public Pessoa( String nome, LocalDate dataNascimento){
    this.nome = nome;
    this.dataNascimento = dataNascimento; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String toString(){
     return this.nome + "Data de Nascimento: "+ this.dataNascimento;
    }
    
    
    
    
}
