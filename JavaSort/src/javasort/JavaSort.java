/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author 15385404608
 */
public class JavaSort {
     public static Pessoa[] geraArrayPessoas() {
        return new Pessoa[]{
            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))
            
        };
    }
    public static void main(String[] args) {
        Pessoa[] vetorPessoa = geraArrayPessoas();
        System.out.println("Pessoas do vetor: ");
        for(Pessoa p: vetorPessoa)
            System.out.println(p);
        
        Comparator<Pessoa> comparaNome = (p1,p2) -> 
                p1.getNome().compareTo(p2.getNome());
        
        Comparator<Pessoa> comparaDataNascimento = (p1,p2) -> 
                p1.getDataNascimento().compareTo(p2.getDataNascimento());
        
       BubbleSortt<Pessoa> bsort = new BubbleSortt<>();
       
       bsort.sort(vetorPessoa, comparaNome);
        for(Pessoa p: vetorPessoa)
            System.out.println(p);
       
        
    }
    
}
