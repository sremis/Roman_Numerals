package com.el.onboarding.junit.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {
		   String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	       String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	       String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	       String[] thousands = {"","M","MM", "MMM","MMMM"};
	       return thousands[getThousands(numberToConvert)]+hundreds[getHundreds(numberToConvert)]+tens[getTens(numberToConvert)]+ones[getOnes(numberToConvert)];
	}
	public static int getOnes(int number){
        return number%10;
    }
    public static int getTens(int number){
        return (number%100-number%10)/10;
    }
    public static int getHundreds(int number){
        return (number/100)%10;
    }
    public static int getThousands(int number){
        return number/1000;
    }
}
