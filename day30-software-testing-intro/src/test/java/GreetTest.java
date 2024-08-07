import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetTest {

    @Test
    void greetChildWithHelloAndFirstname() {
        Greet g = new Greet("Beate Strohmeier", 17, false);
        assertEquals("Hallo Beate :)", g.greetMe());
    }

    @Test
    void greetChildWithHelloAndFirstnameIndependentOfGender() {
        Greet g1 = new Greet("Anna Bauer", 11, true);
        Greet g2 = new Greet("Anna Bauer", 11, false);
        String expectedGreeting = "Hallo Anna :)";
        assertEquals(expectedGreeting, g1.greetMe());
        assertEquals(expectedGreeting, g2.greetMe());
    }

    @Test
    void greetAdultMale() {
        Greet g1 = new Greet("Vittorio De-Marzi", 34, false);
        assertEquals("Guten Tag Herr De-Marzi!", g1.greetMe());
    }

    @Test
    void greetAdultFemale() {
        Greet g1 = new Greet("Zana Prka", 18, true);
        assertEquals("Guten Tag Frau Prka!", g1.greetMe());
    }

    @Test
    void shouldThrowErrorWhenNegativeAge() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            new Greet("Zana Prka", -1, true);
        });

        assertEquals("Person age must be positive number", e.getMessage());
    }

//    @Test
//    void shouldThrowErrorWhenNegativeAgeNichtSoSauber() {
//        try {
//            new Greet("Zana Prka", -1, true);
//        } catch (IllegalArgumentException e) {
//            assertEquals("Person age must be positive number", e.getMessage());
//        }
//    }

    @Test
    void shouldThrowErrorWhenNoLastname() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Greet("Zana", 18, true);
        });
    }

}