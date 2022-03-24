package edu.poniperro.RomanNumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    private String numeroRomano = "";
    private Map<String, Integer> dicRoman = new HashMap<>();

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public int toDecimal() {
        try {
            numeroRomano = validateString(numeroRomano);
            int Positive = sumSingleLetters(numeroRomano);
            int Negative = sumNegatives(numeroRomano);
            return (Positive + Negative);
        } catch (Exception error){
            System.out.println(error);
            return -1;
        }
    }

    private String validateString(String numeroRomano){
        numeroRomano = numeroRomano.replaceAll("[^IXMDVCL]", "");
        return numeroRomano;
    }

    public int sumSingleLetters(String numeroRomano) {
        int totalSum = 0;
        for (int i = 0; i < numeroRomano.length(); i++) {
            char number = numeroRomano.charAt(i); /* Recorrer un string con char */
            totalSum += EnumsNumbers.valueOf(Character.toString(number)).getValue();/*dicRoman.get(Character.toString(number));  Cambio de char a string para que lo encuentre en el dict y se suma*/
        }
        return totalSum;
    }

    public int sumNegatives(String numeroRomano) {
        int totalToRest = 0;
        Pattern regEx = Pattern.compile("([I]+[X]|[I]+[V]|[X]+[C]|[X]+[L]|[C]+[D]|[C]+[M])");
        Matcher match = regEx.matcher(numeroRomano);
        while(match.find()) {
            totalToRest += EnumsNumbers.valueOf(match.group()).getValue();
        }
        return totalToRest;
    }
}