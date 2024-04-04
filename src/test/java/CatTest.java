import io.zipcoder.polymorphism.Cat;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void CatTest(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Pet);
    }
    @Test
    public void speakTest(){
        Cat cat = new Cat("Malo");
        String actual = "Meow";
        String expected = cat.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nameTest(){
        Cat cat = new Cat("Malo");
        String actual = "Malo";
        String expected = cat.getName();
        Assert.assertEquals(expected, actual);
    }




}
