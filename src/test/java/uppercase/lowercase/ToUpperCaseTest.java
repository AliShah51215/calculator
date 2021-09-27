package uppercase.lowercase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToUpperCaseTest {

    @Test
    void shouldMakeLettersUpperCase() {

        ToUpperCase ToUpperCase = new ToUpperCase();


        String text = "lorem ipsum";


        String result = ToUpperCase.transformText(text);


        Assertions.assertEquals("LOREM IPSUM", result);

    }

    @Test
    void shouldMakeAllLettersUpperCase() {

        ToUpperCase ToUpperCase = new ToUpperCase();


        String text = "lOrEm IpSuM";


        String result = ToUpperCase.transformText(text);


        Assertions.assertEquals("LOREM IPSUM", result);

    }

    @Test
    void shouldNotChangeAnything() {

        ToUpperCase ToUpperCase = new ToUpperCase();


        String text = "lOREM IPSUM";


        String result = ToUpperCase.transformText(text);


        Assertions.assertEquals("LOREM IPSUM", result);

    }

}