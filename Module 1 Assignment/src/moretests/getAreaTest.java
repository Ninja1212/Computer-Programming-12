import com.nima.module1.four.*; //Imports all module 1.4 classes
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class getAreaTest {
    // Partition
    /**
     * length and width are positive
     * length and width are negative
     * length is negative and height is positive
     * length in positive and height is negative
     * three sides are given
     */
    @Test
    public void testTriangleAreas(){
        Assert.assertEquals((3*4)/2, new Triangle(3, 4, 5, Colour.GREEN).getArea(), 0.5);
        Assert.assertEquals((-3*4)/2, new Triangle(3, 4, 5, Colour.GREEN).getArea(), 0.5);
        Assert.assertEquals((-3*-4)/2, new Triangle(3, 4, 5, Colour.GREEN).getArea(), 0.5);
        Assert.assertEquals((5*12)/2, new Triangle(5, 12, 13,Colour.GREEN).getArea(), 0.5);
    }

    // Partition
    /**
     * radius is positive
     * radius is negative
    */
    @Test
    public void testCircleAreas(){
        Assert.assertEquals((Math.pow(3,2)*3.14159), new Circle(3, Colour.GREEN).getArea(), 0.5);
        Assert.assertEquals((Math.pow(-3,2)*3.14159), new Circle(-3, Colour.GREEN).getArea(), 0.5);
        Assert.assertEquals((Math.pow(-250,2)*3.14159), new Circle(-250, Colour.GREEN).getArea(), 0.5);
        Assert.assertEquals((Math.pow(0,2)*3.14159), new Circle(0, Colour.GREEN).getArea(), 0.5);
    }
}