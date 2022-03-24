package edu.poniperro.RomanNumbers;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    private String numeroRomano = "";
    private Map<String, Integer> dicRoman = new HashMap<>();

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }
    public int toDecimal() {
        int totalSum = 0;
        /*System.out.println(numeroRomano);*/
        numeroRomano = numeroRomano.replaceAll("[^IXMDVCL]", "");
        /*System.out.println(numeroRomano);*/
        for (int i = 0; i < numeroRomano.length(); i++) {
            char number = numeroRomano.charAt(i); /*Recorrer un string con char*/
            totalSum += dicRoman.get(Character.toString(number)); /* Cambio de char a string para que lo encuentre en el dict y se suma*/
        }
        System.out.println(totalSum);
        return totalSum;
    }
    public void initDicionario() {
        dicRoman.put("I", 1);
        dicRoman.put("V", 5);
        dicRoman.put("X", 10);
        dicRoman.put("L", 50);
        dicRoman.put("C", 100);
        dicRoman.put("D", 500);
        dicRoman.put("M", 1000);
    }
}
