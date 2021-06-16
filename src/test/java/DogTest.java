import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DogTest {
    @Test
    public void elPerroLadra() {
        Dog dog = new Dog();

        assertThat(dog.bark(), equalTo("Guau"));
    }
}
