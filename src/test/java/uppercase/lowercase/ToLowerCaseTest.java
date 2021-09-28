package uppercase.lowercase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToLowerCaseTest {

    @Test
    void shouldMakeLettersLowerCase() {

        ToLowerCase ToLowerCase = new ToLowerCase();


        String text = "Lorem Ipsum";


        String result = ToLowerCase.transformText(text);


        assertEquals("lorem ipsum", result);

    }

    @Test
    void shouldMakeAllLettersLowerCase() {

        ToLowerCase ToLowerCase = new ToLowerCase();


        String text = "LoReM IpSuM";


        String result = ToLowerCase.transformText(text);


        assertEquals("lorem ipsum", result);

    }

    @Test
    void shouldNotChangeAnything() {

        ToLowerCase ToLowerCase = new ToLowerCase();


        String text = "lorem ipsum";


        String result = ToLowerCase.transformText(text);


        assertEquals("lorem ipsum", result);

    }
}