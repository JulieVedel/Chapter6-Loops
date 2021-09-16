package com.company;

public class Exercise4 {
    public static void main(String[] args) {                            //main metoden, det som programmet kører først.
        System.out.println(isAbecedarian("abdest"));                    //bruger funktionen println, der printer metoden "isAbecedarian" med string value "abdest"
    }                                                                   //main metoden afslutter

    public static boolean isAbecedarian(String word) {                  //ny metode der benytter boolean, hvilket vil sige at den skal returne true/false, og sætter string value "abdest" til word,
        boolean flag = true;                                            //du fortæller programmet at boolean flag = true 
        for (int i = 0; i < word.length() - 1; i++) {                   //du laver et for loop som siger at integrer i er lig med 0, og at det skal køre så længe i er mindre end længden af word, og at der skal lægges +1 til i hver gang den kører.
            String letterOne = Character.toString(word.charAt(i));      //String letterOne får en værdi der tester hvor mange characters der er i ordet i forhold til hvor mange der er i
            String letterTwo = Character.toString(word.charAt(i + 1));  //String letterTwo gør det samme som letterOne med undtagelse for at den læser characteren, der er +1 foran.
            int diff = letterOne.compareTo(letterTwo);                  //int diff sammenligner letterOne og letterTwo og finder forskellen mellem de to.

            if (diff > 0) {                                             //if funktion der vurderer om forskellen er højere end 0 
                flag = false;                                           //hvis if funktionen er sand, vil flag være false
                break;                                                  //dette vil slutte programmet
            }
        }
        return flag;                                                    //hvis forskellen ikke er > 0, vil metoden return flag, som også er true. 
    }
}                                                                       
        /* Man kunne evt. sætte en scanner ind så man kan teste sit eget ord, 
        og så sætte nogle println ind der fortæller om ordet er abecedarian 
        hvis det er true eller not abecedarian hvis det er false. */
