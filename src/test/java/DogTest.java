import io.zipcoder.polymorphism.Dog;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogTest(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Pet);
    }
    @Test
    public void speakTest(){
        Dog dog = new Dog("Bop");
        String actual = "Bark";
        String expected = dog.speak();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nameTest(){
        Dog dog = new Dog("Bop");
        String actual = "Bop";
        String expected = dog.getName();
        Assert.assertEquals(expected, actual);

    }


}
