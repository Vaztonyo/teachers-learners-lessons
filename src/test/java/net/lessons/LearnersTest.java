package net.lessons;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LearnersTest {

    Person learner1 = new Learners("Theo", "Walcott", "fast_theo11@gmail.com");
    Person learner2 = new Learners("Ryan", "Fraser", "ryan_fraser24@gmail.com");
    Person learner3 = new Learners("Ruben", "Loftus-Cheek", "ruben_loft-cheek12@gmail.com");


    @Test
    public void shouldBeAbleGetLearnersFirstName(){
        assertEquals("Theo", learner1.getFirstName());

        assertEquals("Ryan", learner2.getFirstName());

        assertEquals("Ruben", learner3.getFirstName());
    }

    @Test
    public void shouldBeAbleGetLearnersLastName(){
        assertEquals("Walcott", learner1.getLastName());

        assertEquals("Fraser", learner2.getLastName());

        assertEquals("Loftus-Cheek", learner3.getLastName());
    }

    @Test
    public void shouldBeAbleGetLearnersEmail(){
        assertEquals("fast_theo11@gmail.com", learner1.getEmail());

        assertEquals("ryan_fraser24@gmail.com", learner2.getEmail());

        assertEquals("ruben_loft-cheek12@gmail.com", learner3.getEmail());
    }
}
