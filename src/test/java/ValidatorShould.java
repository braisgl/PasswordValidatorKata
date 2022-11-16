import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorShould {


    @Test
    void have_more_than_8_characters() {

        String shortpass = "as";
        String password = "asdfghjk";
        String longpass = "dfgnhiawdshbgiabwshigbawreshij";

        assertTrue(Validator.lengthAboveEight(password));
        assertTrue(Validator.lengthAboveEight(longpass));
        assertFalse(Validator.lengthAboveEight(shortpass));
    }

    @Test
    void contains_capital_letter() {
        String valid = "Asasququ";
        String invalid = "asasququ";

        assertTrue(Validator.capitalChecker(valid));
        assertFalse(Validator.capitalChecker(invalid));
    }

    @Test
    void contains_a_lowercase() {
        String valid = "Asasququ";
        String invalid = "ASASASASAS";
        assertTrue(Validator.lowercaseChecker(valid));
        assertFalse(Validator.lowercaseChecker(invalid));
    }

    @Test
    void contains_a_number() {
        String valid = "Asasquq1";
        String invalid = "ASASASASAS";

        assertTrue(Validator.numberChecker(valid));
        assertFalse(Validator.numberChecker(invalid));
    }

    @Test
    void contains_an_underscore() {
        String valid = "Asasquq_";
        String invalid = "ASASASASAS";

        assertTrue(Validator.underscoreChecker(valid));
        assertFalse(Validator.underscoreChecker(invalid));
    }

    @Test
    void validation1() {
        String valid = "Asdf_qu12";
        String invalid = "a";

        assertTrue(Validator.validator1(valid));
        assertFalse(Validator.validator1(invalid));
    }

    /*-------ITERATION 2-------*/

    @Test
    void have_more_than_6_characters() {
        String valid = "aedfqw";
        String invalid = "u";

        assertTrue(Validator.lengthAboveSix(valid));
        assertFalse(Validator.lengthAboveSix(invalid));
    }

    @Test
    void validation2() {
        String valid = "A1sdwe";
        String invalid = "u1A";

        assertTrue(Validator.validator2(valid));
        assertFalse(Validator.validator2(invalid));
    }

    @Test
    void have_more_than_16_characters() {
        String valid = "aedfqw0000000000";
        String invalid = "u";

        assertTrue(Validator.lengthAboveSixteen(valid));
        assertFalse(Validator.lengthAboveSixteen(invalid));
    }

    @Test
    void validation3() {
        String valid = "Asdfg_0000000000";
        String invalid = "as_1A";

        assertTrue(Validator.validator3(valid));
        assertFalse(Validator.validator3(invalid));
    }


}
