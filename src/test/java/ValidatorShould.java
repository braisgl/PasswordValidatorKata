import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorShould {


    @Test
    void have_more_than_8_characters(){

        String shortpass = "as";
        String password = "asdfghjk";
        String longpass = "dfgnhiawdshbgiabwshigbawreshij";

        assertTrue(Validator.lengthChecker(password));
        assertTrue(Validator.lengthChecker(longpass));
        assertFalse(Validator.lengthChecker(shortpass));
    }

    @Test
    void contains_capital_letter(){
        String valid = "Asasququ";
        String invalid = "asasququ";

        assertTrue(Validator.capitalChecker(valid));
        assertFalse(Validator.capitalChecker(invalid));
    }

    @Test
    void contains_a_lowercase(){
        String valid = "Asasququ";
        String invalid = "ASASASASAS";

        assertTrue(Validator.lowercaseChecker(valid));
        assertFalse(Validator.lowercaseChecker(invalid));
    }

    @Test
    void contains_a_number(){
        String valid = "Asasquq1";
        String invalid = "ASASASASAS";

        assertTrue(Validator.numberChecker(valid));
        assertFalse(Validator.numberChecker(invalid));
    }

    @Test
    void contains_an_underscore(){
        String valid = "Asasquq_";
        String invalid = "ASASASASAS";

        assertTrue(Validator.underscoreChecker(valid));
        assertFalse(Validator.underscoreChecker(invalid));
    }

    @Test
    void main(){
        String valid="Asdf_qu12";
        String invalid="a";

        assertTrue(Validator.validate(valid));
        assertFalse(Validator.validate(invalid));
    }
}
