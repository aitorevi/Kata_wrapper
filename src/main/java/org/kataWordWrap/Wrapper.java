package org.kataWordWrap;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    public static String wrap(Integer columns) {

        String originalText = "El perro de San Roque no tiene rabo porque Ramon Ramirez se lo ha cortado mal";
        String[] separatedWords = originalText.split(" ");
        String textResolve = "";
        if (columns != 0){
            for (int i = 0 ; i < separatedWords.length ; i++) {

                if ( i > 0 && (i + 1) % columns == 0 ){
                    textResolve = textResolve + separatedWords[i] + "\n";
                } else {
                    textResolve = textResolve + separatedWords[i] + " ";
                }
            }
            return textResolve.trim();
        }
        return originalText;

        /*
        String originalText = "El perro de San Roque no tiene rabo porque Ramon Ramirez se lo ha cortado mal";
        String[] separatedWords = originalText.split(" ");
        String textResolve = "";
        if (columns != 0){
          //  textResolve = originalText.replace(" ","\n");
            for(Integer i = 0 ; i < separatedWords.length; i++){
                for(Integer j = 0; j < columns; j++){
                    textResolve = textResolve + separatedWords[i] + " ";
                    i++;
                }
                i = i-1;
                textResolve = textResolve.trim() + "\n";
            }
            textResolve = textResolve.trim();

            return textResolve.trim();
        }
        return originalText;
        */

    }
}
