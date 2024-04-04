import io.zipcoder.polymorphism.Cat;
import io.zipcoder.polymorphism.Cow;
import io.zipcoder.polymorphism.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CowTest {
    @Test
    public void cowTest(){
        Cow cow = new Cow();
        Assert.assertTrue(cow instanceof Pet);
    }
    @Test
    public void speakTest(){
        Cow cow = new Cow("Eli");
        String actual = "Moo";
        String expected = cow.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nameTest(){
        Cow cow = new Cow("Eli");
        String actual = "Eli";
        String expected = cow.getName();
        Assert.assertEquals(expected, actual);
    }




}


