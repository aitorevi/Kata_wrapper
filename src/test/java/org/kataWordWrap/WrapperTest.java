package org.kataWordWrap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* Escribes una clase llamada Wrapper, que tiene una única función estática llamada wrap que toma dos argumentos, una
* cadena y un número de columnas. La función devuelve la cadena, pero con saltos de línea insertados en los lugares
* adecuados para asegurarse de que ninguna línea es más larga que el número de columnas. Intenta romper las líneas en los
* límites de las palabras. Como en un procesador de textos, rompe la línea sustituyendo el último espacio de una línea
* por una nueva línea.
*/

/*
* CASOS DE USO
*
* 1-> lineas de una sola palabra *
* 2-> lineas con dos palabras
* n-> lineas con n palabras
* n > cadena.length -> Error controlado
* 0-> cadena original
* n < 0 -> Error controlado
*/


class WrapperTest {

    @Test
    void LongTextWrapper(){
        String expected = "El perro de San Roque no tiene rabo porque Ramon Ramirez se lo ha cortado mal";
        assertEquals( expected ,Wrapper.wrap(0));
    }

    @Test
    void textWrapperOneWord(){
        String expected = "El\nperro\nde\nSan\nRoque\nno\ntiene\nrabo\nporque\nRamon\nRamirez\nse\nlo\nha\ncortado\nmal";
        assertEquals( expected, Wrapper.wrap(1));
    }

    @Test
    void textWrapperTwoWords(){
        String expected = "El perro\nde San\nRoque no\ntiene rabo\nporque Ramon\nRamirez se\nlo ha\ncortado mal";
        assertEquals( expected, Wrapper.wrap(2));
    }

    @Test
    void textWrapperThreeWords(){
        String expected = "El perro de\nSan Roque no\ntiene rabo porque\nRamon Ramirez se\nlo ha cortado\nmal";
        assertEquals( expected, Wrapper.wrap(3));
    }

    @Test
    void textWrapperFourWords(){
        String expected = "El perro de San\nRoque no tiene rabo\nporque Ramon Ramirez se\nlo ha cortado mal";
        assertEquals( expected, Wrapper.wrap(4));
    }

    /*
    @Test
    void textWrapperFiveWords(){
        String expected = "El perro de San Roque\nno tiene rabo porque Ramon\nRamirez se lo ha cortado\nmal";
        assertEquals( expected, Wrapper.wrap(5));
    }
    */
}