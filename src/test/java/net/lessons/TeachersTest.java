package net.lessons;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeachersTest {

    Person teacher1 = new Teachers("Jermain", "Defoe", "jermain_defoe18@gmail.com");
    Person teacher2 = new Teachers("Paul", "Scholes", "paul_scholes18@gmail.com");
    Person teacher3 = new Teachers("Ryan", "Giggs", "ryan_giggs11@gmail.com");

    @Test
    public void shouldBeAbleToGetTeachersFirstName(){
        assertEquals("Jermain", teacher1.getFirstName());

        assertEquals("Paul", teacher2.getFirstName());

        assertEquals("Ryan", teacher3.getFirstName());
    }

    @Test
    public void shouldBeAbleToGetTeachersLastName(){
        assertEquals("Defoe", teacher1.getLastName());

        assertEquals("Scholes", teacher2.getLastName());

        assertEquals("Giggs", teacher3.getLastName());
    }

    @Test
    public void shouldBeAbleToGetTeachersEmail(){
        assertEquals("jermain_defoe18@gmail.com", teacher1.getEmail());

        assertEquals("paul_scholes18@gmail.com", teacher2.getEmail());

        assertEquals("ryan_giggs11@gmail.com", teacher3.getEmail());
    }
}
