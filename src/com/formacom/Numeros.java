package com.formacom;
import java.util.List;
import java.util.ArrayList;

public class Numeros implements INumeros {
    private List<Integer> integerList;

    public Numeros(List<Integer> integerList) {
        this.integerList = integerList;
    }
    
    public Integer menor() {
        Integer numeroMenor = integerList.get(0);
        
        for (Integer i : integerList) {
            if (i < numeroMenor) {
                numeroMenor = i;
            }
        }
        return numeroMenor;
    }
    
    public Integer mayor() {
        Integer numeroMayor = integerList.get(0);
        
        for (Integer i : integerList) {
            if (i > numeroMayor) {
                numeroMayor = i;
            }
        }
        return numeroMayor;
    }
    
    public List<Integer> pares() {
        List<Integer> pares = new ArrayList<>();
        
        for (Integer i : integerList) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        return pares;
    }
    
    public List<Integer> impares() {
        List<Integer> impares = new ArrayList<>();
        
        for (Integer i : integerList) {
            if (i % 2 != 0) {
                impares.add(i);
            }
        }
        return impares;
    }

    public Integer suma() {
        Integer suma = 0;

        for (Integer i : integerList) {
            suma += i;
        }
        return suma;

    }
}
