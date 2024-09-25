/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Comparator;

/**
 *
 * @author 15385404608
 */
public class BubbleSortt<T> {

    /**
     * @param args the command line arguments
     */

        
    void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    public T[] sort(T v[], Comparator<T> comparador){
        int n = v.length;
        for(int fase=1;fase<n;fase++)
            for(int j=0;j<n-fase;j++)
                if(comparador.compare(v[j],v[j+1])>0)
                    troca(v,j,j+1);
        
        return v;
    }
   
}