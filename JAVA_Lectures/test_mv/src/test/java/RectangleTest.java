import org.junit.Assert;

import static org.junit.Assert.*;

public class RectangleTest {
    Rectangle rectangle = new Rectangle(3,4);

    @org.junit.Test
    public void whenWidth3AndHeight4ThanPerimetr14() {

//        Assert.assertEquals(14,rectangle.getPerimetr());
        Assert.assertEquals(14,rectangle.getPerimetr());
    }

    @org.junit.Test
    public void whenWidth3AndHeight4ThanArea12() {
        assertEquals(12,rectangle.getArea());
    }
}